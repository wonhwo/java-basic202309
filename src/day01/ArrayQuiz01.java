package day01;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz01 {
    public static void main(String[] args) {
        int index=0;
        Scanner s=new Scanner(System.in);
        System.out.println("# 먹고싶은 음식을 입력하세요!!");
        System.out.println("# 프로그램을 멈추고 싶으면 그만을 입력하세요.");
        String[] arrFruit=new String[0];
        while (true){
            String fruit=s.next();
            if(fruit.equals("그만")){
                break;
            }else{
                String[] temp=Arrays.copyOf(arrFruit,arrFruit.length+1);
                temp[index]=fruit;
                arrFruit=temp;
                index++;
            }
        }
        s.close();
        System.out.println("먹고 싶은 음식리스트: "+ Arrays.toString(arrFruit));


    }
}
