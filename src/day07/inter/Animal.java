package day07.inter;

// class : 객체를 만드는 설계도
//interface:클래스를 만드는 명세서
public interface Animal {
    //기능을 명세
    //필드 선언 불가능
    //생성자 선언 불가능
    //상수는 선언  가능
    public static final String PET="so cute";
    void feed(String foodName);
    boolean sleep();

    default void makeHobby(){}
}
// }
