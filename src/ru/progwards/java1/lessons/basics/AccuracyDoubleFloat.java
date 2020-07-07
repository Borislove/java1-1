package ru.progwards.java1.lessons.basics;

import javax.sound.midi.Soundbank;
import javax.swing.plaf.synth.SynthRootPaneUI;
import java.util.SortedMap;

public class AccuracyDoubleFloat {
    public static double volumeBallDouble(double radius) {
        Double R = (radius*radius*radius);
        Double pi = 3.14;
        Double a=(double)4/ (double)3;
        return a*(pi*R);
        //нужно правильно прописать 4/3 (должно быть double)
    }
    public static float volumeBallFloat(float radius){
        Float R = (radius*radius*radius);
        Float pi = 3.14f;
        Float b=(float)4/(float)3;
        return b*(pi*R);

    }
    public static double calculateAccuracy(double radius){
        return  volumeBallDouble(radius)-volumeBallFloat((float)radius);
    }
    public static void main(String[] args) {
        System.out.println(volumeBallDouble(6371.2));
        System.out.println(volumeBallFloat(6371.2f));
        System.out.println(calculateAccuracy(6371.2));
    }
}
