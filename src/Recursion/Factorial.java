package Recursion;
// 4 - 0, 1, 1, 2,
// 5 - 0, 1, 1, 2, 3..

public class Factorial {

    public static int fibonacci(int n)
    {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int factorial(int i)
    {
        if(i == 1 || i == 0)
            return 1;
        return i*factorial(i-1);
    }

    public static int multiply(int a, int b)
    {
        if(b == 1)
            return  a;
        return a + multiply(a, b -1);
    }

    public static void main(String [] args)
    {
        System.out.println(factorial(5));
        System.out.println(multiply(1, 4));
        for(int i = 0; i < 10; i++)
                System.out.println(fibonacci(i));
    }
}
