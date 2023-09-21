package day08.collection.song;

import java.util.Scanner;

public class ArtistView {
    private static ArtistRepository ar;
    Scanner s;
    static {
        ar=new ArtistRepository();
    }

    public ArtistView() {
        this.s=new Scanner(System.in);
        this.ar=new ArtistRepository();
        viewProcess();
    }
    void mainView() {
        System.out.println("\n****** 음악 관리 프로그램 ******");
        System.out.println("현재 등록된 가수 : "+ar.getSize()+"명");
        System.out.println("# 1. 노래 등록하기");
        System.out.println("# 2.노래 정보 검색");
        System.out.println("# 3. 프로그램 종료");
        System.out.println("==================================");
    }

    void viewProcess() {
        while (true) {
            mainView();
            String menuNum = input(">> ");
            switch (menuNum) {
                case "1":
                    singerRegistrater();
                    stop();
                    break;
                case "2":
                    searchsinger();
                    stop();
                    break;
                case "3":
                    System.out.println("# 프로그램을 종료합니다.");
                    System.exit(0);
                    break;
                default:
            }
        }
    }

    private void searchsinger() {
        System.out.println("# 검색할 가수명을 입력하세요");
        String singer=input("-가수명: ");
        ar.search(singer);
    }

    void singerRegistrater(){
        System.out.println("# 노래 등록을 시작합니다.");
        String singer=input("-가수명: ");
        String singTitle=input("-노래명: ");
        ar.Registrater(singer,singTitle);
    }
    public String input(String message){
        System.out.print(message);
        return s.nextLine();
    }
    void stop(){
        System.out.printf("\n========엔터 눌러서 계속===========");
        s.nextLine();
    }
}
