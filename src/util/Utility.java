package util;

import java.util.Scanner;

public class Utility {
    static Scanner s=new Scanner(System.in);

    public static void makeLine(){
        System.out.println("=====================================");

    }
    //문자열을 입력받는 기능
    public static String input(String message){
        System.out.println(message);
        return s.nextLine();
    }
}
