package day11.stream;

import java.util.Comparator;
import java.util.Optional;

import static day11.stream.Menu.*;
import static java.util.Comparator.*;

public class Finding {
    public static void main(String[] args) {
        //음식메뉴 중에 채식주의자가 먹을 수 있는 요리가 있는가?
        boolean b = menuList.stream()
                .anyMatch(Dish::isVegeterian);
        System.out.println("b = " + b);

        boolean b1 = menuList.stream()
                .anyMatch(dish -> dish.getCalories() < 50);
        System.out.println("b1 = " + b1);

        boolean b2 = menuList.stream()
                .allMatch(dish -> dish.getCalories() < 1000);
        System.out.println("b2 = " + b2);

        boolean b3 = menuList.stream()
                .noneMatch(dish -> dish.getCalories() < 1000);
        System.out.println("b3 = " + b3);

        //음식중 칼로리가 가장 낮은 음식
        Optional<Dish> min = menuList.stream()
                .min(comparing(Dish::getCalories));
        System.out.println("dish = " + dish);
    }
}
