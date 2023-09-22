package day09.io;

import java.io.File;
import java.io.IOException;

public class FileExample {
    public static final String ROOT_PATH="C:/";
    public static void main(String[] args) {
        //폴더 생성
        //파일정보 객체 생성
        File file = new File(ROOT_PATH + "/hello");

        //폴더 생성 명령
        if(!file.exists())file.mkdir();
        //파일 생성하기
        File file1 = new File(ROOT_PATH + "/hello/food.txt");
        if(!file1.exists()) {
            try {
                file1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("파일 생성에 실패했습니다.");
            }
        }
    }
}
