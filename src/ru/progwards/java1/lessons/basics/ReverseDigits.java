package ru.progwards.java1.lessons.basics;

import java.sql.SQLOutput;

public class ReverseDigits {
    public static int reverseDigits(int number) {
        int a = (number % 10);
        int b = (number / 10 % 10);
        int c = (number / 100);

        return a*100+b*10+c*1;

    }
    public static void main(String[] args)
    {
       System.out.println (reverseDigits (521));

    }

}
