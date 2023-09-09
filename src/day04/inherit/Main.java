package day04.inherit;

public class Main {
    public static void main(String[] args) {
//        new Player("zz");
        Warrior w= new Warrior("주차왕파킹");
        Mage m= new Mage("주차왕파킹");
        Hunter h= new Hunter("asdf");
        w.status();
        h.status();
        m.status();
//        Mage m =new Mage("충격왕쇼킹");
//        Hunter h=new Hunter("요리왕쿠킹");
//
//        System.out.println(w.getNickName());
        System.out.println("==========================");
        new Student();
    }
}
