package day07.inter;

public class Main {
    public static void main(String[] args) {
        Animal duck = new Duck();
        Animal bullDog = new BullDog();
        Huntable shark = new Shark();
        Animal rabbit = new Rabbit();

        Animal[] animals={duck,bullDog,rabbit};

        for (Animal animal : animals) {
            animal.feed("맛도리사료");
        }
    }
}
