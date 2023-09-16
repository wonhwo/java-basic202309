package day07.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryExample2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("정수1:"); //InputMismatch
            int n1 = s.nextInt();
            System.out.println("정수2:"); //InputMismatch
            int n2 = s.nextInt();
            int result = n1 / n2; //Arithmetic
            System.out.println("result = " + result);
        } catch (InputMismatchException e) {
            System.out.println("정수만 입력해주세요");
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }finally {
            System.out.println("이 코드는 뭔 ㅈㄹ을 해도 실행 됩니다.");
        }
        s.close();
        System.out.println("프로그램 정상 종료");
    }
}
