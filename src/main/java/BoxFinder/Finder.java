package BoxFinder;

import java.util.List;

public class Finder {
    public Key findKeyWithLoop(Box mainBox) {
        List<Item> items = mainBox.getItems();

        while(items.size() != 0) {
            Item item = items.get(0);

            if (item instanceof Key) {
                return (Key) item;
            } else if (item instanceof Box) {
                items.addAll(((Box) item).getItems());
            }

            items.remove(item);
        }

        return null;
    }

    public Key findKeyWithRecursive(Box mainBox) {
        for (Item item : mainBox.getItems()) {
            if (item instanceof Key) {
                return (Key) item;
            } else if (item instanceof Box) {
                Key findKey = findKeyWithRecursive(((Box) item));
                if (findKey != null) {
                    return findKey;
                }
            }
        }

        return null;
    }
}
