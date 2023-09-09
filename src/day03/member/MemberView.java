package day03.member;

import java.util.Scanner;

// 역할: 회원관리 앱의 입출력을 담당
public class MemberView {


    Scanner sc;
    MemberRepository mr;

    public MemberView() {
        this.sc = new Scanner(System.in);
        this.mr=new MemberRepository();
        viewProcess();
    }

    /**
     * 초기 메인 화면을 출력
     */
    void mainView() {
        boolean totalMember= mr.countTotalMember();
            System.out.println("\n##### 회원 관리 시스템 #####");
        if(totalMember){
        System.out.println("* 1. 회원 정보 등록하기");
        }
        System.out.println("* 2. 개별회원 정보 조회하기");
        System.out.println("* 3. 전체회원 정보 조회하기");
        System.out.println("* 4. 회원 정보 수정하기");
        System.out.println("* 5. 회원 정보 삭제하기");
        System.out.println("* 6. 회원정보 복구하기");
        System.out.println("* 7. 프로그램 끝내기");
        System.out.println("=============================");
    }

    /**
     * 프로그램 화면 흐름을 제어하는 기능
     */
    void viewProcess() {
        while (true) {
            mainView();
            String menuNum = input(">> ");

            switch (menuNum) {

                case "1":
                    boolean totalMember= mr.countTotalMember();
                    if(totalMember){
                        signUp();
                    }
                    else{
                        System.out.println("# 최대 등록 인원수를 초과하였습니다.");
                        stop();
                    }
                    break;
                case "2":
                    memberShow();
                    break;
                case "3":
                    mr.showMembers();
                    stop();
                    break;
                case "4":
                    changePassword();
                    break;
                case "5":
                    showDeleteMember();
                    break;
                case "6":
                    showMemberRestore();
                    break;
                case "7":
                    String answer = input("# 정말로 종료합니까? [y/n] : ");
                    if (answer.toLowerCase().charAt(0) == 'y') {
                        System.out.println("# 프로그램을 종료합니다.");
                        System.exit(0);
                    } else {
                        continue;
                    }
                    break;
                default:
                    System.out.println("\n# 메뉴 번호를 다시 입력하세요");
            }
        }
    }

    private void showMemberRestore() {
        String email=input("# 복구할 이메일을 입력하여주세요");
        String password=input("# 복구할 비밀번호를 입력하여주세요");
        mr.deleteMember(email,password,true);
    }

    private void showDeleteMember() {
        String email=input("# 삭제할 이메일을 입력하여주세요");
        String password=input("# 삭제할 비밀번호를 입력하여주세요");
        mr.deleteMember(email,password,false);
    }

    private void memberShow() {
        String email=input("# 정보를 검색할 이메일을 입력해주세요");
        Member member= mr.findMemberByEmail(email,false);
        if(member!=null){
            member.showDetailInfo();
            stop();
        }
        else{
            System.out.println("\n# 조회 결과가 없습니다.");
            stop();
        }
    }

    private void changePassword() {
        //이메일을 입력받아
        String email=input("# 수정 대상의 이메일");

        //수정 대상 탐색
        Member member = mr.findMemberByEmail(email,false);

        //회원이 탐색 됨
        if(member!=null){
            System.out.printf("#%s님의 비밀번호를 변경합니다.\n",member.memberName);
            String newPassword = input("# 새로운 비밀번호: ");
            //새 비번이 기존비번과 같은 경우
            if(member.password.equals(newPassword)){
                System.out.println("# 기존 비밀번호와 동일합니다. 변경을 취소합니다.");
                stop();
                return;
            }
            mr.updatePassword(newPassword,email);
            System.out.println("# 비밀번호 변경이 완료되었습니다.");
            stop();
        }else{
            System.out.println("\n# 조회 결과가 없습니다.");
            stop();
        }

    }

    //회원가입 입출력을 처리하는 메서드
     void signUp() {
          String email= extracted();
         String name=input("# 이름: ");
         String pw=input("# 패스워드: ");
         Gender gender= getGender();
         String age=input("# 나이: ");
//         실제 배열에 저장 명령
         //랜덤 아이디 생성(1~999999)
         int randomId= (int)(Math.random()* 999999)+1;
         Member newMember = new Member(randomId,email,pw,name,gender,Integer.parseInt(age));
         mr.addMember(newMember);

         System.out.println("# 회원 가입 성공!!");
         stop();

    }

    private Gender getGender() {
        while (true){
            String inputGender = input("# 성별 [M/F]: ");
            switch (inputGender){
                case "M":
                    return Gender.MALE;
                case "F":
                    return Gender.FEMALE;
                default:
                    System.out.println("# 성별을 M또는 F로 입력하세요");
            }
        }
    }

    String  extracted() {
        while (true){
        String email=input("# 이메일: ");
            if(!mr.isDuplicatedEmail(email)){break;}
            System.out.println("# 이메일이 중복되었습니다.");
        }
        return null;
    }

    //입력처리 간편하게 하는 메서드
    public String input(String message){
        System.out.print(message);
        return sc.nextLine();
    }
    void stop(){
        System.out.print("========엔터 눌러서 계속===========");
        sc.nextLine();

    }
}
