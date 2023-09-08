package day02.array;

import java.util.Arrays;

public class StringList {

    // 스트링 배열을 필드로 등록
    String[] sArr;

    // 생성자를 통해 배열을 초기화
    StringList() {
        sArr = new String[0];
    }
    StringList(String... initData) {
        sArr = new String[initData.length];
        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = initData[i];
        }
    }
    //    배열 맨 끝데이터 제거
    void pop(){
        String[] temp=new String[sArr.length-1];
        for (int i = 0; i <temp.length ; i++) {
            temp[i]=sArr[i];
        }
        sArr=temp;
        temp=null;
    }
        void push(String food){
        String[] temp=Arrays.copyOf(sArr,sArr.length+1);
        temp[temp.length-1]=food;
        sArr=temp;
        temp=null;
    }
    void insert(int index,String food){
        String[] temp =Arrays.copyOf(sArr,sArr.length+1);
        for (int i = temp.length - 1; i > index; i--) {
            temp[i] = temp[i-1];
        }
        temp[index] = food;
        sArr = temp;
        temp[index]=food;
        sArr=temp;
    }
    void remove(String food){
        int index=indexOf(food);
        for (int i = index; i < sArr.length-1; i++) {
            sArr[i] = sArr[i+1];
        }
        pop();
    }
    void remove(int index){
        for (int i = index; i < sArr.length-1; i++) {
            sArr[i] = sArr[i+1];
        }
        pop();
    }
    boolean includes(String targetName) {
        return indexOf(targetName) != -1;
    }
    int indexOf(String food){
        int index=0;
        for (int i = 0; i < sArr.length; i++) {
            if (food.equals(sArr[i])) {
                index=i;
            }
        }
        return index;
    }
    void clear(){
        sArr=new String[0];
    }
    boolean isEmpty(){
        boolean result=true;
        if(sArr.length!=0){
            result=false;
        }
        return result;
    }
    int size(){
        return sArr.length;
    }

    void printArray() {
        System.out.println(Arrays.toString(sArr));
    }
}
