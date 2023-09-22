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
    private static void  mainView() {
        System.out.println("\n****** 음악 관리 프로그램 ******");
        System.out.println("현재 등록된 가수 : "+ar.getSize()+"명");
        System.out.println("# 1. 노래 등록하기");
        System.out.println("# 2.노래 정보 검색");
        System.out.println("# 3. 프로그램 종료");

        System.out.println("==================================");


    }

    private void viewProcess() {
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
                    System.out.println("# 잘못된 메뉴를 선택하셨습니다.");
            }
        }
    }

    private  void searchsinger() {
        System.out.println("# 검색할 가수명을 입력하세요");
        String singer=input("-가수명: ");
        if(ar.isRegistered(singer)){
            System.out.println("#" + singer + "님의 노래목록");
            System.out.println("=============================");
        }else {
            System.out.println("해당 가수는 등록되지 않았습니다.");
        }
        ar.search(singer);
    }
    //신규 가수를 map에 추가하는 기능
    private  void singerRegistrater(){
        System.out.println("# 노래 등록을 시작합니다.");
        String singer=input("-가수명: ");
        String singTitle=input("-노래명: ");
        if(!ar.isRegistered(singer)){
            ar.newRegistrater(singer,singTitle);
            System.out.println("#" + singer + "님이 신규 등록되었습니다.");

        }
        //기존 가수 정보에 노래만 추가
        else {
            boolean flag= ar.Register(singer,singTitle);
            if(flag){
                System.out.println("#" + singer + "님의 노래목록에 " + singTitle + "곡이 추가되었습니다.");
            }
            else{
                System.out.println("# ["+singTitle+"] 곡은 이미 등록된 곡입니다.");
            }
        }

    }
    public String input(String message){
        System.out.print(message);
        return s.nextLine();
    }
    public  void stop(){
        System.out.printf("\n========엔터 눌러서 계속===========");
        s.nextLine();
    }
}
