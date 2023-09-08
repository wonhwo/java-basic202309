package day03.Player;

public class Player {
    String nickName;
    int level;
    int hp;

    public Player() {
        this("이름없음");
        System.out.println("1번 생성자 호출!");

    }

    public Player(String nickName) {
        this(nickName,1,50);
        System.out.println("2번 생성자 호출!");
    }

    public Player(String nickName, int level, int hp) {
        this.nickName = nickName;
        this.level = level;
        this.hp = hp;
        System.out.println("3번 생성자 호출!");
    }

    void attack(Player target){
        System.out.println("this = " + this);
        System.out.printf("%s님이 %s님을 공격했습니다.",this.nickName,target.nickName);
        System.out.println("target = " + target);
    }

    @Override
    public String toString() {
        return "\nPlayer{" +
                "nickName='" + nickName + '\'' +
                ", level=" + level +
                ", hp=" + hp +
                '}';
    }
}
