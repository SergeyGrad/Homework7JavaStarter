import java.util.Scanner;

public class Arithmetics {
    static int add (int a, int b)
    {
        int c = a + b;
        System.out.println(c);
        return c;
    }
    static int sub (int a, int b)
    {
        int c = a - b;
        System.out.println(c);
        return c;
    }
    static int mul (int a, int b)
    {
        int c = a * b;
        System.out.println(c);
        return c;
    }
    static int div (int a, int b)
    {
        if (b != 0) {
            System.out.println(a / b);
            return a/b;
        } else {
            System.out.println("На ноль делить нельзя");
            return -1;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Введите число: ");
        int a = in.nextInt();
        System.out.println("Введите число: ");
        int b = in.nextInt();
        System.out.println("Введите знак: ");
        String c = in.next();

        switch (c)
        {
            case "+":
                int add = add (a,b);
                break;
            case "-":
                int sub = sub (a,b);
                break;
            case "*":
                int mul = mul (a,b);
                break;
            case "/":
                int div = div (a,b);
                break;
        }
    }
}
