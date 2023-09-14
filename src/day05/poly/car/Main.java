package day05.poly.car;

import util.Utility;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Avante avante = new Avante();
        Car cc=avante;
        Car avante2 = new Avante();
        Car mustang = new Mustang();
        Car stinger = new Stinger();
        Car[] avantes={avante,avante2,mustang,stinger};

        for (Car car : avantes) {
            car.accelerate();
        }
        Object[] arr={"hello","안녕",10,false};

        Utility.makeLine();

        Driver park = new Driver();
        park.drive(avante);
        park.drive(mustang);

        CarShop shop=new CarShop();
        Utility.makeLine();
        //다운 캐스팅은 수동
        Mustang myCar = (Mustang) shop.exportCar(6000);
        myCar.accelerate();
        myCar.exhaust();
        //업 캐스팅은 자동
        Car[]myCarList={myCar};

        //객체의 다운캐스팅은 전제조건이 있음
        //한번 업캐스팅이 된 자식객체만 다시 다운캐스팅 가능
        Utility.makeLine();
        Stinger myStriner = new Stinger();
        Stinger ss=(Stinger) myStriner;

//        Car car = new Car();
//        Avante aaa=(Avante) car;
        Utility.makeLine();
         Car carcar= shop.exportCar(6000);
        System.out.println(carcar instanceof Avante);
        System.out.println(carcar instanceof Stinger);
        System.out.println(carcar instanceof Mustang);

        if(carcar instanceof Mustang){
            Mustang ms =(Mustang) carcar;
            ms.exhaust();
        }
    }
}
