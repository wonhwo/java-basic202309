package day11.lambda;

import java.util.ArrayList;
import java.util.List;

public class MappingApple {
    //리스트가아니라 셋에 담으면 중복 제거까지 가능
    public static List<Color> mappingAppleByColor(List<Apple> apples) {
        List<Color> colorList = new ArrayList<>();
        for (Apple apple : apples) {
            Color color = apple.getColor(); //색상 추출
            colorList.add(color) //담기
            ;
        }
        return colorList;
    }

    public static <X, Y> List<Y> mapping(List<X> apples, GenericFunction<X, Y> mapper) {
        List<Y> mappedList = new ArrayList<>();
        for (X x : apples) {
            Y y = mapper.apply(x); //<-조건식 파라미터화 Y를 X에서 추출
            mappedList.add(y); //담기
             }
        return mappedList;
    }
}
