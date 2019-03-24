public class Overload {
    public static void main(String[] args) {
        int a = multiply(5, 3);
        double b = multiply(5.5);
        System.out.println(a);
        System.out.println(b);

    }
    static int multiply(int x, int y) {
        return x * y;
        }

        static double multiply(double x) {
            return x * x;
        }
}
