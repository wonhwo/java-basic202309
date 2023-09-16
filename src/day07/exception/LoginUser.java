package day07.exception;

import util.Utility;

public class LoginUser {
    String userAccount; //사용자 가입계정
    String userPassword;// 사용자 비밀번호

    public LoginUser(String userAccount, String userPassword) {
        this.userAccount = userAccount;
        this.userPassword = userPassword;
    }

    //로그인 검증
    public String validate(String inputAccount, String inputPassword) throws LoginFailException {
        if (userAccount.equals(inputAccount)) {
            if (userPassword.equals(inputPassword)) {
                return "SUCCESS";
            } else {
                throw new LoginFailException("비밀번호가 올바르지 않음")
            }
        } else {
            throw new LoginFailException("이맃하는 아이디가 없음");
        }
    }

    public static void main(String[] args) {
        LoginUser user=new LoginUser("abc123","1234");
        String id= Utility.input("ID:");
        String pw=Utility.input("PW:");
        try {
            String result=user.validate(id,pw);
            System.out.println("result = " + result);
        } catch (LoginFailException e) {
            System.out.println(e.getMessage());
        }
    }
}
