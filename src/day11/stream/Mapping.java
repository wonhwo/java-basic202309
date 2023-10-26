package day11.stream;
import day11.stream.Menu;

import java.lang.reflect.Type;
import java.util.List;
import java.util.stream.Collectors;

import static day11.stream.Menu.menuList;

public class Mapping {
    //이름과 칼로리만 가진 클래스 설계
    private  static class simpleDish{
        private String name;
        private int calories;

        public simpleDish(String name, int calories) {
            this.name = name;
            this.calories = calories;
        }
        public simpleDish(Dish dish) {
            this.name = dish.getName();
            this.calories = dish.getCalories();
        }


        @Override
        public String toString() {
            return "simpleDish{" +
                    "name='" + name + '\'' +
                    ", calories=" + calories +
                    '}';
        }
    }
    //stream의 map : 컬렉션(리스트, 셋, 맵..)에서 원하는 정보만
    //               추출하여 새로운 컬렉션으로 반환해줌
    private static class TypeNName{
        private String name;
        private Dish.Type type;

        public TypeNName(String name, Dish.Type type) {
            this.name = name;
            this.type = type;
        }

        public TypeNName(Dish dish) {
            this.name=dish.getName();
            this.type=dish.getType();
        }

        @Override
        public String toString() {
            return "TypeNName{" +
                    "name='" + name + '\'' +
                    ", type=" + type +
                    '}';
        }
    }
    public static void main(String[] args) {
        List<Integer> collect = menuList.stream()
                .map(dish -> dish.getCalories())
                .collect(Collectors.toList());
        System.out.println(collect);

        /*
            요리목록에서 메뉴 이름과 칼로리를 추춣고 싶다.
         */
        menuList.stream()
                .map(dish->new simpleDish(dish))
                .collect(Collectors.toList())
                .forEach(d-> System.out.println(d));

        /*
        * 메뉴 목록에서 칼로리가 500칼로리보다 큰
        * 음식들을 필터링한 다음에 음식의 이름과 타입만
        * 추출해서 출력해주세요
        * */
        menuList.stream()
                .filter(dish -> dish.getCalories()>500)
                .map(dish->new TypeNName(dish))
                .collect(Collectors.toList())
                .forEach(d-> System.out.println(d));
    }
}
