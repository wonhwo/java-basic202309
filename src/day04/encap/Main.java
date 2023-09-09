package day04.encap;

import day04.modi.pac2.C;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("그랜져");

        myCar.setSpeed(80);
        System.out.println(myCar.getSpeed());

        myCar.setMode('Z');

        myCar.pressButton();


    }

}
