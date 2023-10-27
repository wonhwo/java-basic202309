package day11.stream;

import util.Utility;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static day11.stream.Menu.*;
import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class Sorting {
    public static void main(String[] args) {
        List<Dish> collect = menuList.stream()
                .sorted(comparing(Dish::getCalories))
                .collect(toList());
        for (Dish dish : collect) {
            System.out.println("dish = " + dish);
        }
        System.out.println("==================================");
        //칼로리로 내림차 정렬
        List<Dish> collect2 = menuList.stream()
                .sorted(comparing(Dish::getCalories).reversed())
                .collect(toList());
        for (Dish dish : collect2) {
            System.out.println("dish = " + dish);
        }
        Utility.makeLine();
        //300칼로리보다 큰 요리중에 top3 필터링
        menuList.stream()
                .filter(dish -> dish.getCalories()<500)
                .sorted(comparing(Dish::getCalories).reversed())
                .limit(3)
                .collect(toList())
                .forEach(System.out::println);
    }
}
