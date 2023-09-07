package day02;
//실행용 클래스 : 메인메서드 제작
public class DancerMain {
    public static void main(String[] args) {
        Dancer lee=new Dancer();
//        lee.dancerName="리정";
//        lee.crewName="solo";
//        lee.genre="스트릿";
        lee.dance();
        lee.stretch();
        lee.introduce();
        System.out.println("===============================");
        Dancer key = new Dancer("키");
        key.stretch();
        key.dance();
        key.introduce();
        System.out.println("==================================");
        Dancer IK = new Dancer("아이키");
        IK.stretch();
        IK.dance();
        IK.introduce();
        System.out.println("===================================");
        Dancer hong=new Dancer("홍박사","틱톡커",Genre.KPOP,DanceLevel.BEGINNER);
        hong.stretch();
        hong.dance();
        hong.introduce();

        System.out.println(lee);
        System.out.println(key);



    }
}
