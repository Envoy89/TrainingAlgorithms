package SomeTasks.SquareFinder;

public class SquareFinder {
    public double findMinSquare(Rectangle input) {
        double x = input.getX();
        double y = input.getY();

        if (x == 0 || y == 0) {
            return 0;
        }

        double maxVal = Math.max(x, y);
        double minVal = Math.min(x, y);

        double val = maxVal / minVal;
        if (val % 1 == 0) {
            return minVal;
        } else {
            Rectangle newInput = new Rectangle(maxVal - minVal, minVal);

            return findMinSquare(newInput);
        }
    }
}
