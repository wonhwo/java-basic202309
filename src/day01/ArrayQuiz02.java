package day01;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] member = new String[]{"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
        System.out.println("변경 전 정보: " + Arrays.toString(member));
        int index=0;
        boolean a = true;
        while (a) {
            System.out.println("- 수정할 멤버의 이름을 입력하세요.");
            String name = s.next();
            for (int i = 0; i < member.length; i++) {
                if (member[i].equals(name)) {
                    System.out.println("변경할 이름을 입력하세요.");
                    String inName=s.next();
                    String[] temp=Arrays.copyOf(member,member.length);
                    for (int j = 0; j <temp.length ; j++) {
                        if(temp[j].equals(name)){
                            index=j;
                            break;
                        }
                    }
                    temp[index]=inName;
                    member=temp;
                    temp=null;
                    System.out.println("변경 후 정보:"+Arrays.toString(member));
                    a = false;
                }
            }
            if(a){
                System.out.println(name + "은(는) 없는 이름입니다.");
            }



        }
        s.close();
    }
}
