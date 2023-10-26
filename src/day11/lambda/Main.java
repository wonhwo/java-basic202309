package day11.lambda;

import util.Utility;

import java.util.List;

import static day11.lambda.Color.*;
import static day11.lambda.FilterApple.*;
import static day11.lambda.MappingApple.mapping;

public class Main {
    public static void main(String[] args) {

        // 사과 바구니 생성
        List<Apple> appleBasket = List.of(
                new Apple(80, GREEN)
                , new Apple(155, GREEN)
                , new Apple(120, RED)
                , new Apple(97, RED)
                , new Apple(200, GREEN)
                , new Apple(50, RED)
                , new Apple(85, YELLOW)
                , new Apple(75, YELLOW)
        );

        System.out.println("========= 녹색 사과 필터링 ========");
        List<Apple> greenApples
                = filterGreenApples(appleBasket);
        for (Apple greenApple : greenApples) {
            System.out.println(greenApple);
        }

        System.out.println("======= 다양한색상 사과 필터링 =======");
        List<Apple> filteredColorApples
                = filterApplesByColor(appleBasket, YELLOW);
        for (Apple filteredColorApple : filteredColorApples) {
            System.out.println(filteredColorApple);
        }

        System.out.println("====== 원하는 조건으로 필터링 =======");

        // 100g 이하인 사과를 필터링
        List<Apple> apples1
                = filterApples(appleBasket, new LightApplePredicate());
        for (Apple apple : apples1) {
            System.out.println(apple);
        }

        // 빨강 또는 노랑 사과만 필터링
        Utility.makeLine();
        List<Apple> apples2 = filterApples(appleBasket,apple ->
                apple.getColor() == RED || apple.getColor() == YELLOW
        );

        for (Apple apple : apples2) {
            System.out.println(apple);
        }

        List<Apple> apples = filterApples(appleBasket,
            apple-> apple.getColor()==GREEN &&apple.getWeight()>=100);

        System.out.println("======여러가지 필터링======");
        List<Integer> numbers=List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> filter = filter(numbers, n -> n % 2 == 1);
        System.out.println(filter);

        List<String> words = List.of("짜장면","짬뽕","탕수육","피자");
        List<String> filter1 = filter(words, s -> s.length() == 3);
        System.out.println("filter1 = " + filter1);

        List<Apple> filter2 = filter(appleBasket, a -> a.getWeight() < 100 && a.getColor() == RED);
        for (Apple apple : filter2) {
            System.out.println("apple = " + apple);
        }
        System.out.println("===============사과의 색만 매핑===========");
        List<Color> colorList = MappingApple.mappingAppleByColor(appleBasket);
        System.out.println(colorList);

        System.out.println("===============숫자에서 제곱수 매핑===========");
        List<Integer> mapping = mapping(numbers, n -> n * n);
        System.out.println("mapping = " + mapping);

        System.out.println("===============첫 글자 매핑===========");
        List<Character> mapping1 = mapping(words, s -> s.charAt(0));
        System.out.println("mapping1 = " + mapping1);

        System.out.println("===============사과에서에서 무개 매핑===========");
        List<Integer> mapping2 = mapping(appleBasket, a -> a.getWeight());
        System.out.println("mapping2 = " + mapping2);


    }
}
