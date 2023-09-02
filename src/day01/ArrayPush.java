package day01;

import java.util.Arrays;

public class ArrayPush {
    public static void main(String[] args) {
//        push : 맨 끝에 데이터를 추가
        int[]arr={10,20,30};
        int newDate = 40;
        int[]temp = new int[arr.length+1];
        for (int i = 0; i <arr.length ; i++) {
            temp[i]=arr[i];
        }
        temp[temp.length-1]=newDate;
        arr=temp;
        temp=null;

        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("temp = " + Arrays.toString(temp));

    }
}
