package day08.collection.list;
import day03.fruit.Apple;

import java.util.*;

import static util.Utility.makeLine;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("asdf");
        list.add("QWer");
        list.add("zxcv");
        list.add("fdgdfg");

        System.out.println(list);
        //중간 삽입 add(index,e)
        list.add(2,"ㅁㄴㅇㄹ");
        System.out.println(list.size());

        //indexOf(E e)해당 데이터 인덱스 반환
        System.out.println(list.indexOf("asdf"));

        //contains(E e):해당 데이터 유무 확인
        System.out.println(list.contains("asdf"));

        //remove(index), remover(object)
        list.remove("asdf");
        list.remove(1);
        System.out.println(list);

        //set(index,newElement)
        list.set(0,"ASdfqw");
        System.out.println(list);

        //get(index) : 리스트에 저장된 데이터 참조
        String s=list.get(1);
        System.out.println(s);

        //반복문 처리
        makeLine();
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }makeLine();
        for (String string : list) {
            System.out.println(string);
        }
        //clear() : 전체 삭제
        // isEmpty() : 리스트가 비어잇는지 확인
        makeLine();
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list.isEmpty());

        //리스트에 초기값 넣고 시작하기
        List<Integer> numbers=new ArrayList<>(
//                List.of(5,15,25,99,64,25)
                Arrays.asList(9,5,6,7,2,3,8,4)
        );
        makeLine();
        System.out.println(numbers);
        //오름차 정렬
        numbers.sort(Integer::compareTo);
        System.out.println(numbers);
        //내림차
        numbers.sort(Comparator.reverseOrder());
        System.out.println(numbers);

        //배열리스트와 연결리스트
        /*
        *              탐색속도     삽입삭제속도
        * 배열리스트     빠름          느림
        * 연결리스트     느림          빠름
        * */

        List<Apple> appleList=new LinkedList<>();
//        appleList.add(new Apple(18));
    }

}
