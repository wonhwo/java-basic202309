package day03.member;

import java.util.Arrays;

// 책임 : 회원을 여러명 저장,관리하는 클래스
public class MemberRepository {
    public static final int MAX_REGISTER=11;
//    필드 : 회원 배열
//    [{},{}]
    Member[]memberList; //가입된 회원 배열
    Member[] removeMembers;//삭제된 회원 배열

    public MemberRepository() {
        this.memberList=new Member[]{
                new Member(1,"abc@def.com","1234","콩벌레",Gender.MALE,15),
                new Member(2,"fff@def.com","4321","벌레",Gender.FEMALE,17),
                new Member(3,"xxx@def.com","1236","콩레",Gender.MALE,20),


        };
        this.removeMembers=new Member[0];
    }
    /**
     * 토탈 멤버를 구해서 1번 항목 여부를 판단하는 메서드
     */
    boolean countTotalMember(){
        if(memberList.length<MAX_REGISTER){
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
    Member findMemberByEmail(String email,boolean restore){
        Member[] targetList=restore?removeMembers:memberList;
        int index=findMemberIndexByEmail(email);
        return index>=0?memberList[index]:null;
    }
    /**
     * 이메일을 통해 인덱스를 가져오는 메서드
     */
    int findMemberIndexByEmail(String email,String password,boolean restore){
        Member[] targetList=restore?removeMembers:memberList;
        for (int i = 0; i < targetList.length; i++) {
            Member member = targetList[i];
            if (email.equals(member.email)&&password.equals(member.password)) {
                return i;
            }
        }
        return -1;
    }
    int findMemberIndexByEmail(String email){
        for (int i = 0; i < memberList.length; i++) {
            Member member = memberList[i];
            if (email.equals(member.email)) {
                return i;
            }
        }
        return -1;
    }
    /**
     * 비밀번호를 수정하는 메서드
     */
    void updatePassword(String newPassword,String email){
        Member member=findMemberByEmail(email,false);
        member.password=newPassword;
    }
    /**
     * 회원탈퇴를 처리하는 메서드
     */
    void deleteMember(String email,String password,boolean restore) {
        Member[] deltargetList=restore?removeMembers:memberList;
        Member[] addtargetList=restore?memberList:removeMembers;


        int index = findMemberIndexByEmail(email,password,restore);
        if(index==-1){
            System.out.println("아이디 또는 비밀번호가 틀렸습니다.  ");
        }
        Member deletedMember=deltargetList[index];
        for (int i = index; i <deltargetList.length-1 ; i++) {
            deltargetList[i]=deltargetList[i+1];
        }
        Member[] temp = new Member[deltargetList.length-1];
        for (int i = index; i < temp.length; i++) {
            temp[i] = deltargetList[i ];
        }
        deltargetList = temp;
        temp=new Member[addtargetList.length+1];
        for (int i = 0; i < addtargetList.length ; i++) {
            temp[i]=addtargetList[i];
        }
        temp[temp.length-1]=deletedMember;
        addtargetList=temp;
        if(restore){
            removeMembers=deltargetList;
            memberList=addtargetList;
        }else{
            removeMembers=addtargetList;
            memberList=deltargetList;
        }
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
