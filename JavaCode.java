public class MathUtils {
    public int add(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public double divide(int x, int y) {
        if (y == 0) {
            return -1.0; 
        }
        return (double) x / y;
    }
}
