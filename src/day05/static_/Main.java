package day05.static_;

import util.Utility;
import static java.lang.Math.random;
import static java.lang.System.out;
public class Main {
    public static void main(String[] args) {

        Count c1 = new Count();
        Count c2 = new Count();

        c1.x = 10;
        c1.y = 50;

        c2.x = 20;
        c2.y = 100;
        c1.x *= 3;
        c1.y++;

        System.out.println("c1.x = " + Count.x);
        System.out.println("c1.y = " + c1.y);


        Utility.makeLine();
        Utility.input("이름 : ");

        random();
//       println("c2.x = " + c2.x);
//        println("c2.y = " + c2.y);

        Count.m1(c1);
        Count.m1(c2);
        c1.m2();
        c2.m2();

    }
}
