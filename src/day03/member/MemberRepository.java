package day03.member;

import java.util.Arrays;

// 책임 : 회원을 여러명 저장,관리하는 클래스
public class MemberRepository {
//    필드 : 회원 배열
//    [{},{}]
    Member[]memberList; //가입된 회원 배열
    Member[] removeMembers;//삭제된 회원 배열

    public MemberRepository() {
        this.memberList=new Member[]{
                new Member(1,"abc@def.com","1234","콩벌레",Gender.MALE,15),
                new Member(2,"fff@def.com","4321","벌레",Gender.FEMALE,17),
                new Member(3,"xxx@def.com","1236","콩레",Gender.MALE,20),
                new Member(3,"xxx@def.com","1236","콩레",Gender.MALE,20),
                new Member(3,"xxx@def.com","1236","콩레",Gender.MALE,20),
                new Member(3,"xxx@def.com","1236","콩레",Gender.MALE,20),
                new Member(3,"xxx@def.com","1236","콩레",Gender.MALE,20),
                new Member(3,"xxx@def.com","1236","콩레",Gender.MALE,20),
                new Member(3,"xxx@def.com","1236","콩레",Gender.MALE,20),
                new Member(3,"xxx@def.com","1236","콩레",Gender.MALE,20),
                new Member(3,"xxx@def.com","1236","콩레",Gender.MALE,20),
                new Member(3,"xxx@def.com","1236","콩레",Gender.MALE,20),


        };
        this.removeMembers=new Member[0];
    }
    /**
     * 토탈 멤버를 구해서 1번 항목 여부를 판단하는 메서드
     */
    boolean countTotalMember(){
        if(memberList.length<11){
            return true;
        }
        return false;
    }
    /**
     * 모든 회원정보를 출력하는 메서드
     */
    void showMembers(){
        System.out.printf("===============현재 회원 정보 (총 %d명 ) ================\n",memberList.length);
        for (Member member : memberList) {
            System.out.println(member.inform());

        }
    }
    /**
     * 패스워드를 포함한 회원정보를 세로로 출력하는 메서드
     *
     * @return
     */
    Member showAllMembers(String email){
        for (Member member : memberList) {
            if(email.equals(member.email)){
                return member;
            }
        }
        return null;
    }
    /**
     * 새로운 회원정보를 추가하는 메서드
     */
    boolean addMember(Member newMember){
        //push 알고리즘
        Member[]temp=new Member[memberList.length+1];
        for (int i = 0; i < memberList.length ; i++) {
            temp[i]=memberList[i];
        }
        temp[temp.length-1]=newMember;
        memberList=temp;
        temp=null;
        return true;
    }
    /**
     * 이메일의 중복여부를 확인하는 메서드
     * @param1 email - 중복검사 대상 이메일
     * @return -중복 되었다면 t, 아니라면 f
     */
    boolean isDuplicatedEmail(String email){
        for (Member member : memberList) {
            if(email.equals(member.email)){
                return true;
            }
        }
        return false;
    }
    /**
     * 이메일을 통해 특정 회원 객체를 찾아서 반환하는 메서드
     * @param1 email - 탐색할 멤버객체의 이메일
     * @return - 해당 이메일과 일치하는 회원의 모든정보 객체
     *              이메일이 일치하지 않으면 null리턴
     */
    Member findMemberByEmail(String email){
        for (Member member : memberList) {
            if(email.equals(member.email)){
                return member;
            }
        }
        return null;
    }
    /**
     * 비밀번호를 수정하는 메서드
     */
    void updatePassword(String newPassword,String email){
        Member member=findMemberByEmail(email);
        member.password=newPassword;
    }
    /**
     * 회원탈퇴를 처리하는 메서드
     */
    void deleteMember(String email,String password) {
        int index = 0;
        for (int i = 0; i < memberList.length; i++) {
            if (memberList[i].email.equals(email) && memberList[i].password.equals(password)) {
                Member[] temp=Arrays.copyOf(removeMembers,removeMembers.length+1);
                temp[temp.length-1]=memberList[i];
                removeMembers=temp;
                index = i;
            }
        }
        Member[] temp = Arrays.copyOf(memberList, memberList.length - 1);
        for (int i = index; i < temp.length; i++) {
            temp[i] = memberList[i + 1];
        }
        memberList = temp;
    }
    /**
     * 회원 복구 메서드
     */
    boolean restoreMember(String email,String password){
        if(memberList.length>10){
            return false;
        }
        for (int i = 0; i < removeMembers.length; i++) {
            if (removeMembers[i].email.equals(email) && removeMembers[i].password.equals(password)) {
                Member[] temp =Arrays.copyOf(memberList,memberList.length+1);
                Member rmMember=removeMembers[i];
                temp[temp.length-1]=rmMember;
                memberList=temp;

                return true;
            }
        }
        return false;
    }
}
