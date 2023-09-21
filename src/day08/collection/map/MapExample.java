package day08.collection.map;

import day05.poly.car.Mustang;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String ,Object>map=new HashMap<>();
        //추가 put(K,V)
        map.put("지갑잔액",5000);
        map.put("좋아하는 자동차",new Mustang());
        map.put("저녁메뉴","계란말이");
        System.out.println(map.size());

        //get(key)
        int money= (int)map.get("지갑잔액");
        String dinner=(String) map.get("저녁메뉴");
        System.out.println(money);

        //중복된 키를 저장하면 값이 변경됨
        map.put("저녁메뉴","김치찌개");
        System.out.println(map);
        Set<String> strings = map.keySet();
        System.out.println("strings = " + strings);
        for (String string : strings) {
            System.out.printf("%s : %s\n",string,map.get(string));
        }
    }
}
