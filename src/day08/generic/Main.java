package day08.generic;

public class Main {
    public static void main(String[] args) {
        Apple a1= new Apple(10);
        System.out.println(a1);

        AppleBasket ab=new AppleBasket();
        ab.setApple(a1);
        Apple apple=ab.getApple();

        Banana banana = new Banana();

        BananaBasket bb=new BananaBasket();
        bb.setBanana(banana);

        Basket<Apple> appleBasket = new Basket<Apple>();
        appleBasket.setFruit(new Apple(10));
        Apple app=appleBasket.getFruit();

        Basket<Banana> bananaBasket= new Basket<>();
        bananaBasket.setFruit(new Banana());
        Banana banana1=bananaBasket.getFruit();

        Basket<Peach> peachBasket = new Basket<>();
        peachBasket.setFruit(new Peach());

        GenericList<String> slist=new GenericList<>();
        slist.push("자방면");
        slist.push("볶음면");
        slist.push("라면");
        slist.pop();
        slist.printArray();

        GenericList<Integer>num=new GenericList<>();
        num.push(1);
        num.push(2);
        num.push(3);
        num.printArray();

        GenericList<Apple>appleGenericList=new GenericList<>();
        appleGenericList.push(new Apple(17));
        appleGenericList.push(new Apple(15));
        appleGenericList.push(new Apple(8));
        appleGenericList.printArray();
    }
}
