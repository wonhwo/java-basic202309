package day05.protec.pac1;

public class A {
    protected int f1;
    int f2;

    protected void m1(){}
    void m2(){}

    public A() {
        f1=1;
        f2=2;
    }
    protected A(int a) {
        m1();m2();
    }
    A(String b ) {
    }
}

