package day02;

//라이브러리 클래스 : 메인 메서드를 만들지 않음
public class Dancer {
    //    객체의 속성(필드)
    String dancerName; //댄서 이름
    String crewName; //팀 이름
    Genre genre; //장르
    DanceLevel dancerLevel;  //댄스 수준 (0,1,2)

    //    생성자 선언 : 객체의 초기값 세팅
    //생성자도 함수의 일종, 리턴데이터가 주소값으로 고정
    //따라서 리턴 타입을 적지 않음.
//   객체의 기능(메서드) : static을 붙이지 말 것
    Dancer() {
        dancerName = "리정";
        crewName = "저스트절크";
        dancerLevel = DanceLevel.PRO;
        genre = Genre.STREET;
    }

    Dancer(String dName) {
        dancerName = dName;
        crewName = "샤이니";
        dancerLevel = DanceLevel.AMATEUR;
        genre = Genre.KPOP;
    }
    Dancer(String dName,String cName) {
        dancerName = dName;
        crewName = cName;
        dancerLevel = DanceLevel.PRO;
        genre = Genre.KPOP;
    }

    public Dancer(String dancerName, String crewName, Genre genre, DanceLevel dancerLevel) {
        this.dancerName = dancerName;
        this.crewName = crewName;
        this.genre = Genre.STREET;
        this.dancerLevel = DanceLevel.BEGINNER;
    }

    //춤 추는 기능
    void dance() {
        System.out.println(genre + "춤을 열정적으로 춥니다.");
    }

    //스트레칭을 하는 기능
    void stretch() {
        System.out.println(dancerName + "님이 몸을 풉니다.");
    }

    //자기 소개하기
    void introduce() {
        System.out.printf("내 이름은 %s이고 %s팀에 소속 되어 있습니다.\n", dancerName, crewName);
    }
}
