package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
    public static boolean containsDigit(int number, int digit) {
        while (number > 0) {
            if (number % 10 == digit) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
    public static int fiboNumber(int n) {
        int a = 1;
        int b = 0;
        int d = 0;
        for (int i = 1; i <= n; i++) {
            d = a + b;
            b = a;
            a = d;
            if (i == 1) {
                b = 0;
            }
        }
        return a;
    }
    public static boolean isGoldenTriangle(int a, int b, int c) {
        double d = 1.61703;
        double e = 1.61903;
        if (a == b || b == c || c == a) {
            if ((a == b) && a>= (c * d) && a <=(c * e))
                return true;
            if ((b == c) && b>= (a * d) && b <=(a * e))
                return true;
            if ((c == a) &&c >=  (b * d) && c <=(b * e))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDigit(234,3));
        System.out.println(fiboNumber(10));
        System.out.println(isGoldenTriangle(89,89,55));
        int a =1;
        int b=1;
        int c;
        System.out.println(a+" "+b+" ");
        for (int i=3; i<=15; i++) {
            c=a+b;
            System.out.println(c+" ");
            a=b;
            b=c;
        }
        System.out.println();
    }
}
