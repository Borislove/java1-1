package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {
    public static int maxSide(int a, int b, int c) {
        if (a>=b&&a>=c) {
            return a;
        }
        if (b>=a&&b>=c) {
            return b;
        }
        if (c>=a&&c>=b) {
            return c;
        }
        else
            return 0;
    }
    public static int minSide(int a, int b, int c) {
        if (a<=b&&a<=c) {
            return a;
        }
        if (b<=a&&b<=c) {
            return b;
        }
        if (c<=a&&c<=b) {
            return c;
        }
        else
            return 0;
    }
    public static boolean isEquilateralTriangle(int a, int b, int c) {
        if (a==b&&a==c) {
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(maxSide(5, 7, 7));
        System.out.println(minSide(3, 3, 4));
        System.out.println(isEquilateralTriangle(100, 100, 100));
    }
}
