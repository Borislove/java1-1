package ru.progwards.java1.lessons;

import java.sql.SQLOutput;

public class ReverseDigits {
    public static int reverseDigits(int number) {
        int a = (number % 10);
        int b = (number / 10 % 10);
        int c = (number / 100);
        System.out.print(a);
        System.out.print(b);
        System.out.print(c);
        return (a + b + c);

    }
    public static void main(String[] args)
    {
        reverseDigits (325);
    }

}
