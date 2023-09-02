package day01;

import java.util.Arrays;

public class ArrayInsert {
    public static void main(String[] args) {
        int[] arr={10,20,90,100,120,999,2000};
        int newData=50;
        int tartgetIndex=2;
//        20과 90사이에 50을 넣기
        int[] temp = Arrays.copyOf(arr, arr.length+1);
        for (int i = tartgetIndex; i <temp.length-1 ; i++) {
            temp[i+1]=arr[i];
        }
        temp[tartgetIndex]=newData;
        arr=temp;
        temp=null;
        System.out.println(Arrays.toString(arr));
    }
}
