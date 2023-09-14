package day05.static_;

public class Calculator {
     String color;
    static double pi;
    double calcAreaCircle(int r){
        return pi * r*r;
    }
    void paint(String color){
        this.color=color;
    }
}
