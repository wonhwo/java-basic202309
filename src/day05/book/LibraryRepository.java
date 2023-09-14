package day05.book;

import day05.poly.car.Mustang;

import static day03.member.Gender.MALE;

//데이터 관리 목적 클래스
public class LibraryRepository {
    private static BookUser[] bookUser;

    static {
        bookUser = new BookUser[]{
                new BookUser("말포이", 14, MALE, 1)
        };
    }


    // 도서들의 정보
    private static Book[] bookList;

    static {
        bookList = new Book[]{
                new CookBook("기적의 집밥책", "김해진", "청림라이프", true),
                new CartoonBook("떨어지면 끝장맨", "스에노부 케이코", "대원씨아이", 18),
                new CartoonBook("원펀맨", "One", "대원씨아이", 15),
                new CookBook("삐뽀삐뽀 119 이유식", "하정훈", "유니책방", false),
                new CookBook("오늘은 아무래도 덮밥", "이마이 료", "참돌", true),
                new CartoonBook("이세계로 전이했으니 치트를 살려 마법검사가 되기로 했다", "Shinkoshoto", "대원씨아이", 12)
        };
    }

    private static Book[] rentBookList;

    static {
        rentBookList = new Book[0];
    }

    void showTotalBook(boolean input) {
        int count = 0;
        if (input == true) {
            System.out.println("========= 모든 도서 정보 ========");
            for (Book book : bookList) {
                count++;
                System.out.printf("%s\n",book.info());
            }
        } else {
            System.out.println("========= 대여가능한 도서 정보 ========");
            for (Book book : bookList) {
                count++;
                System.out.printf("%d %s\n", count, book.info());
            }
        }

    }

    void userSearch() {
        for (BookUser user : bookUser) {
            user.userInfor();
        }
    }

    void searchBook(String word) {
        for (Book book : bookList) {
            if (book.getTitle().contains(word)) {
                System.out.println(book.info());
            }
            if (book.getAuthor().contains(word)) {
                System.out.println(book.info());
            }
        }
    }

    public void compareAge(int num) {
        for (int i = 0; i < bookList.length; i++) {
            if (i == num - 1) {
                if (bookList[i] instanceof CartoonBook) {
                    CartoonBook cb = (CartoonBook) bookList[i];
                    if (bookUser[0].getAge() <= cb.getAccessAge()) {
                        System.out.println("# 도서 대여에 실패하였습니다.");
                    } else {
                        System.out.println("# 성공적으로 대여되었습니다.");
                    }
                }
                if (bookList[i] instanceof CookBook) {
                    CookBook cb = (CookBook) bookList[i];
                    if (cb.isCoupon()) {
                        int couponCount = bookUser[0].getCouponCount() + 1;
                        bookUser[0].setCouponCount(couponCount);
                        System.out.println("# 성공적으로 요리책이 쿠폰발급과 함께 대여되었습니다.");
                    }
                }
            }
            else{
                return;
            }
        }
    }
}
