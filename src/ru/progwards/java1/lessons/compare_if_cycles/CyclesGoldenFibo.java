package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
    public static boolean containsDigit(int number, int digit) {
        while (number>0) {
            number/=10;
            int b=number%10;
            if (b == digit) {
                return true;
            }

        }
        return false;
    }
    public static int fiboNumber(int n) {
        int one=1;
        int two=2;
        int i=1;
        while (n-2>i) {
            int summ=one+two;
            one=two;
            two=summ;
            i=i+1;
        }
        return two;
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
    }
}
