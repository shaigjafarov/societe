package algoritm.leman;

public final class Immut {

    //todo yeni method elave et
    private A a;

    public Immut(A a) {
        this.a = a;
        //fdffdv
    }

    public A getA() {
        A copyA = new A();
        copyA.deyer = a.deyer;
        return copyA;
    }//aaaaaaa
}

class Test {

    public static void main(String[] args) {
        Immut immut = new Immut(new A());
        immut.getA().deyer = 5;

        System.out.println(immut.getA().deyer);


    }
}


class A {

    int deyer;
}