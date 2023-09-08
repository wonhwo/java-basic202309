package day03.member;

public class test {
    public static void main(String[] args) {
        MemberRepository mr= new MemberRepository();
        Member thief= new Member(4,"ttt@yyy.com","9999","밥도둑",Gender.MALE,23);
        mr.addMember(thief);
        mr.showMembers();
        System.out.println("===============================");
        String email="ttt@yyy.com";
        boolean flag1 =mr.isDuplicatedEmail(email);
        System.out.println("flag1 = " + flag1);
        Member foundMember= mr.findMemberByEmail(email);
        System.out.println("foundMember.inform() = " + foundMember.inform());
        
    }
}
