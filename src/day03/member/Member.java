package day03.member;

import java.time.LocalDate;
//객체지향의 중요원칙 중 하나는 단일 책임 원칙
//SRP:하나의 클래스는 하나의 책임만 가져라
//회원 설계도

public class Member {
    int memberId; // 아이디
    String email; //이메일
    String password; //비밀번호
    String memberName; //이름
    Gender gender; //성별

    int age; //나이
    LocalDate regDate; //회원가입일

    public Member(int memberId, String email, String password, String memberName, Gender gender, int age) {
        this.memberId = memberId;
        this.email = email;
        this.password = password;
        this.memberName = memberName;
        this.gender = gender;
        this.age = age;
        this.regDate = LocalDate.now();
    }
//    회원정보를 문자열로 만들어서 리턴하는 기능
    String inform(){
        String convertGender=this.gender==Gender.MALE?"남성":"여성";
        return String.format("# %d번 | %s | %s | %s | %d세",this.memberId,this.email,this.memberName,convertGender,this.age);
    }
}
