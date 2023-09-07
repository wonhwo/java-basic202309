package day02;

public class MethodBasic {
    static int add(int n1, int n2) {
        return n1 + n2;
    }

    public static void main(String[] args) {
        // 함수: 코드블록의 기능적 표현
        // ex )  add(10, 20)
        // 메서드: 객체의 동작 표현
        // ex )  샤프계산기.add(10, 20)
        //       카시오계산기.add(20, 30)

        // 자바는 모든것을 객체로 표현하고, 함수마저도 모두
        // 메서드로 처리한다.
        // 자바의 메서드는 클래스 내부에만 선언이 가능
        // 다른 메서드 안에서 선언할 수 없음.
        MakeLine();
        System.out.println(add(5, 1));
        int[] arr = {10, 20, 30};
        System.out.println(addAll(arr));
        System.out.println(addAll(5, 100, 900, 1000));
        System.out.println(compareNumbers(new int[]{1, 2}, new int[]{3, 4, 5})
);
    }
//    2개의 정수를 전달받아서
    //4개의 사칙연산 결과를 리턴
     static int[] operaterAll(int n1, int n2){
        return new int[]{
                n1+n2,
                n1-n2,
                n1*n2,
                n1/n2
        };
    }

    static int[] compareNumbers(int[] arr1, int[] arr2) {
        return arr1.length > arr2.length ? arr1 : arr2;
    }

    static void MakeLine() {
        System.out.println("===========================");
    }

    // n개 정수를 전달받아 총합을 구하는 함수
    static int addAll(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
}
