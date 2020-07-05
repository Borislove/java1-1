package ru.progwards.java1.lessons;

import javax.sound.midi.Soundbank;
import javax.swing.plaf.synth.SynthRootPaneUI;
import java.util.SortedMap;

public class AccuracyDoubleFloat {
    public static double volumeBallDouble(double radius) {
        Double R = (radius*radius*radius);
        Double pi = 3.14;
        return 4/3*(pi*R);
    }
    public static float volumeBallFloat(float radius){
        Float R = (radius*radius*radius);
        Float pi = 3.14f;
        return 4/3*(pi*R);

    }
    public static double calculateAccuracy(double radius){
        return  volumeBallDouble(radius)-volumeBallFloat((float)radius);
    }
    public static void main(String[] args) {
        System.out.println(volumeBallDouble(6371.2));
        System.out.println(volumeBallFloat(6371.2f));
        System.out.println(calculateAccuracy(radius);
    }
}
