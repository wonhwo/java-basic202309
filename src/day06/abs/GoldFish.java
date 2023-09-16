package day06.abs;

public class GoldFish extends Pet{

    public GoldFish(String name, String kind, int age) {
        super(name, kind, age);
    }
    @Override
    public void takeNap() {
        System.out.println("금붕어는 눈뜨고 자는대여???");
    }
    @Override
    public void eat() {
        System.out.println("홈뇸뇸");
    }
}
