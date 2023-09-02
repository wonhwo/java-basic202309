package day01;

import java.util.Scanner;

public class StdIO {
    public static void main(String[] args) {
//        자바에서 입력을 처리하는 객체
//        입력이 필요한 상황에서 1번 선언하면 됨
        Scanner s = new Scanner(System.in);
        System.out.printf("이름을 입력하세용 : ");
        String name= s.next();
        System.out.printf("나이를 입력하세용 : ");
        int age= s.nextInt();
        System.out.printf("name : " + name+"\nage : "+age+"\n");

        int birthYear= 2023-age+1;
        System.out.println(birthYear+"년생");
        s.close();
        
    }
}
