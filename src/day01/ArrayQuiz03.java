package day01;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] member = new String[]{"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
        System.out.println("우리반 학생들의 별명: " + Arrays.toString(member));
        boolean a = true;
        int index = 0;
        while (a) {
            System.out.println("- 삭제할 학생의 별명을 입력하세요!");
            String name = s.nextLine();
            for (int i = 0; i < member.length; i++) {
                if (member[i].equals(name)) {
                    String[] temp = Arrays.copyOf(member, member.length - 1);
                    for (int j = 0; j < temp.length; j++) {
                        if (temp[j].equals(name)) {
                            index = j;
                            for (int k = index; k < temp.length; k++) {
                                temp[k] = member[k + 1];
                            }
                            break;
                        }
                    }
                    member = temp;
                    temp = null;
                    System.out.println("삭제 후 정보:" + Arrays.toString(member));
                    a = false;
                    break;
                }

            }
            if(a){
                System.out.println("해당 별명(" + name + ")은 존재 하지 않습니다.");
            }
        }

    }
}
