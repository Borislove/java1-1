package ru.progwards.java1.lessons.classes;

import org.w3c.dom.ls.LSOutput;

public class ComplexNum {
    int a;
    int b;

    public ComplexNum(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return a + "+" + b + "i";
    }

    public ComplexNum add(ComplexNum num) {
       int actual=this.a+num.a;
       int notActual=this.b+num.b;
       ComplexNum result=new ComplexNum(actual, notActual);
       return result;

    }
    public ComplexNum sub(ComplexNum num) {
        int actual=this.a-num.a;
        int notActual=this.b-num.b;
        ComplexNum result=new ComplexNum(actual, notActual);
        return result;
    }
    public ComplexNum mul(ComplexNum num) {
        int actual=this.a*num.a;
        int notActual=this.b*num.b;
        ComplexNum result=new ComplexNum(actual, notActual);
        return result;
    }
    public ComplexNum div(ComplexNum num) {
        int actual=this.a/num.a;
        int notActual=this.b/num.b;
        ComplexNum result=new ComplexNum(actual, notActual);
        return result;
    }

}
