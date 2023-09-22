package day09.io.stream;

import java.io.FileInputStream;

public class FileInputExample {
    public static void main(String[] args) {
        String path = "C:\\develop\\java-basic202309\\src\\day03\\member\\MemberRepository.java";
        try (FileInputStream fis = new FileInputStream(path)) {
            int read = 0;
            while (read != -1) {
                read = fis.read();
                //아스키 출력 담당 write()
                System.out.write(read);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
