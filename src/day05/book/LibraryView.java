package day05.book;

import day03.member.MemberRepository;

import java.util.Scanner;

public class LibraryView {
    private static LibraryRepository repository;
    Scanner s;
    LibraryRepository Lr;

    public LibraryView() {
        this.s = new Scanner(System.in);
        this.Lr=new LibraryRepository();
        viewProcess();
    }
    void mainView() {
        System.out.println("\n======== 도서 메뉴 ========");
        System.out.println("# 1. 마이페이지");
        System.out.println("# 2. 도서 전체 조회");
        System.out.println("# 3. 도서 제목으로 검색");
        System.out.println("# 4. 도서 대여하기");
        System.out.println("# 5. 도서 저자이름으로 검색");
        System.out.println("# 9. 프로그램 종료하기");
    }

    void viewProcess() {
        while (true) {
            mainView();
            String menuNum = input("- 메뉴 번호 : ");
            switch (menuNum) {
                case "1":
                    Lr.userSearch();
                    stop();
                    break;
                case "2":
                    Lr.showTotalBook(true);
                    stop();
                    break;
                case "3":
                    showSearchWord();
                    stop();
                    break;
                case "4":
                    rentBook();
                    stop();
                    break;
                case "5":
                    showSearchAuthor();
                    break;
                case "9":
                    System.out.println("# 프로그램을 종료합니다.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\n# 메뉴 번호를 다시 입력하세요");
            }
        }
    }

    private void rentBook() {
        Lr.showTotalBook(false);
        String rentNum= input("# 대여할 도서 번호 입력: ");
        Lr.compareAge(Integer.parseInt(rentNum));
    }

    private void showSearchWord() {
        String word= input("# 검색어: ");
        Lr.searchBook(word);
    }
    private void showSearchAuthor() {
        String word= input("# 저자 이름: ");
        Lr.searchBook(word);
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
