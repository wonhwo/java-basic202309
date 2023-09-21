package day08.collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        //빠른 저장속도, 중복을 제거
        //인덱스, 키를 사용하지 않아서 개별탐색에는 불리함.
        Set<String> foodSet=new HashSet<>();
        //add() 데이터 추가
        boolean f1= foodSet.add("sadf");
        boolean f2= foodSet.add("sadf");
        foodSet.add("ㅂㅈㄷㄱ");
        foodSet.add("qwer");
        foodSet.add("ㅁㄴㅇㄹ");
        foodSet.add("zxcv");
        System.out.println(foodSet.size());
        System.out.println(foodSet);
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        for (String s : foodSet) {
            System.out.println("s = " + s);
        }
        //삭제 remove
        foodSet.remove("sadf");
        System.out.println(foodSet);
        //데이터 중복을 빠르게 제거할 때
        List<Integer>numbers=new ArrayList<>(
                List.of(1,1,1,3,3,5,7,7,7,7,9,8,9,9,9)
        );
        System.out.println(numbers);
        //Set으로 변환
        Set<Integer>numberSet=new HashSet<>(numbers);
        System.out.println("numberSet = " + numberSet);

        //List로 변환
        numbers=new ArrayList<>(numberSet);

    }
}
