package day06.abs;

public class Dog extends Pet {

    public Dog(String name, String kind, int age) {
        super(name, kind, age);
    }

    @Override
    public void takeNap() {
        System.out.println("댕댕!");
    }

    @Override
    public void eat() {
        System.out.println("함냠냠");
    }

    @Override
    public void walk() {
        System.out.println("뽈뽈뽈");
    }
}
