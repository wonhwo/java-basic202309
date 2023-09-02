package day01;

public class Casting {
    public static void main(String[] args) {
        byte a = 100;
        int b = a;
        System.out.println("b = " + b);

        int c = 2000;
        byte d = (byte) c;
//        d:1 1101000
//        1의 보수 : 0010111
//        2의 보수 : +     1
//                  0011000
        System.out.println("d = " + d);
        double n = 3.5;
        int m = (int) n;
        System.out.println("m = " + m);

//        연산시 일어나는 자동캐스팅
        int k = 100;
        double j = 5.6;

        double result = k + j;
//        데이터 크기가 다른 데이터 끼리으 ㅣ연산은
//        작은 쪽을 큰 쪽으로 자동 변환 후 연산을 진행
        char x='A';
        int y=3;
        char result2= (char) (x+y);
        System.out.println(result2);
//        int보다 작은 데이터 (byte, short, char)
//        의 연산은 결곽 자동으로 int 처리 된다.
        byte b1=100;
        byte b2=120;

         int result3 = b1+b2;
        System.out.println(('A'+'C'));
        
        int g=24;
        double r= (double) (g) /5;
        System.out.println("r = " + r);
    }
}
