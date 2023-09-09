package day04.inherit;

public class Warrior extends Player{

    private int rage;

    public Warrior(String nickName) {
        super(nickName);
        System.out.println("워리어 생성자 호출!");
        this.rage = 100;
    }
    public void powerSlash(){
        System.out.println("파워 슬래시!!!");
    }
    //오버라이딩
    //규칙 : 형태(이름,매개변수,리턴타입)은 부모가물려준대로 그대로
    @Override //오버라이딩 규칙을 맞췄는지 검증
    public void status(){
        super.status();
        System.out.println("# 분노: "+ rage);
    }

    public int getRage() {
        return rage;
    }

    public void setRage(int rage) {
        this.rage = rage;
    }
}
