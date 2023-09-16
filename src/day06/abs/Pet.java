package day06.abs;

public abstract class Pet {
    //공통속성
    private String name;//이름
    private String kind;//종
    private int age;//나이

    public Pet(String name, String kind, int age) {
        this.name = name;
        this.kind = kind;
        this.age = age;
    }
    //공통 기능
    //낮잠 기능
    public abstract void takeNap();
    //밥먹는 기능
    public abstract void eat();
    public void walk(){}
    public final String info(){
        return "hello!!"+name;
    }
}
