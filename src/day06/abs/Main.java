package day06.abs;

public class Main {
    public static void main(String[] args) {
        Dog dog= new Dog("댕댕이","말티주",3);
        Cat cat= new Cat("애옹이","먼치킨",1);
        Pet[]pets={
                dog,
                //cat,new Pet("복순이","말티즈는참지않지",3)
        };
        for (Pet pet : pets) {
            pet.takeNap();
            pet.eat();
        }
    }
}
