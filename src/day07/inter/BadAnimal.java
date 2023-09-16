package day07.inter;

public interface BadAnimal extends Violent,Huntable{
    @Override
    void hunt(Animal animal);

    @Override
    void angry();
}
