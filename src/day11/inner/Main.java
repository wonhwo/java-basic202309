package day11.inner;

public class Main {
    private static class Subcalculator implements Calculator {
        @Override
        public int operate(int n1, int n2) {
            return n1 - n2;
        }
    }

    public static void main(String[] args) {
        Calculator c1 = new AddCalculator();
        Calculator c2 = new Subcalculator();
        System.out.println(c1.operate(10, 20));
        System.out.println(c2.operate(30, 25));

        //익명 클래스
        Calculator c3 = (n1, n2) -> n1 * n2;
        System.out.println(c3.operate(30, 25));

        //lambda : 인터페이스의 추상메서드가 단 하나일때만 가능
        Calculator c4 = (n1, n2) -> n1 / n2;
        System.out.println(c4.operate(20,10));

    }
}
