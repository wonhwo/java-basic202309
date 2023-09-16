package day07.exception;

public class TryExample1 {
    public static void main(String[] args) {
        int n1=10,n2=0;

        System.out.println("나누기 시작");

        try {
            int result =n1/n2;
            System.out.printf("%d / %d = %d\n",n1,n2,result);
        }catch (Exception e){
            System.out.println("에러"+e);
        }

        System.out.println("프로그램 종료");
    }
}
