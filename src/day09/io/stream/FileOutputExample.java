package day09.io.stream;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputExample {
    public static void main(String[] args) {
        //바이트기반 스트림 - 이미지, 영상, 텍스트, 기타파일 전부 처리
        //텍스트기반 스트림 - 텍스트 특화

        String msg = "멍멍이는 왈왈\nㅎㅎㅎㅎㅎㅎㅎㅎㅎ";
//try with resources : auto close기능
        try (FileOutputStream fileOutputStream = new FileOutputStream("C:/hello/dog.txt");
        ) {
            fileOutputStream.write(msg.getBytes());
        } catch (FileNotFoundException e) {
            System.out.println("해당 경로를 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("출력 시스템에 장애가 발생");
        }/*finally {
            try {
                if(fileOutputStream!=null) fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/

    }
}
