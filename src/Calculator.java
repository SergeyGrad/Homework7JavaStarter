public class Calculator {
        static int calculate (int a, int b, int c) {
            return (a + b + c) / 3;
        }

    public static void main(String[] args) {
        int a = 10, b = 5, c = 5;
        int result = calculate (a, b, c);
        System.out.println(result);
    }
}
