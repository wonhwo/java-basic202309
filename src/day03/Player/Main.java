package day03.Player;

public class Main {
    public static void main(String[] args) {
        new Player();
        Player parking = new Player("주차왕파킹");
        Player farking = new Player("키보드워리어");
        parking.attack(farking);
        System.out.println("parking = " + parking);
        System.out.println("farking = " + farking);
    }



}
