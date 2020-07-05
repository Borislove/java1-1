package ru.progwards.java1.lessons.basics;

import org.w3c.dom.ls.LSOutput;

import java.util.SortedMap;

public class Astronomy {
    public static Double sphereSquare(Double r){
        Double R;
        R=r*r;
        Double pi = 3.14;
        return 4*pi*R;
    }
    public static Double earthSquare(){
        return (sphereSquare(6371.2));

    }
    public static Double mercurySquare(){
        return (sphereSquare(2439.7));
    }
    public static Double jupiterSquare() {
        return (sphereSquare(71492.0));
    }
    public static Double earthVsMercury(){
        return (earthSquare()/mercurySquare())*100;
    }
    public static Double earthVsJupiter() {
        return (earthSquare() / jupiterSquare()) * 100;
    }

    public static void main(String[] args) {
        System.out.println (sphereSquare(5.5));
        System.out.println(earthSquare());
        System.out.println(mercurySquare());
        System.out.println(jupiterSquare());
        System.out.println(earthVsMercury());
        System.out.println(earthVsJupiter());
    }
}
