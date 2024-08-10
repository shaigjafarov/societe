package test;

public class FunctionTest {

    public static void main(String[] args) {


        I iObject = new I() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };
        System.out.println(iObject.sum(2,4));


        I lambdaObject1= (int x,int z)->x+z;
        I lambdaObject2= ( x, z)->x+z;
        I lambdaObject3= ( x, z)->{return x+z;};
        System.out.println(lambdaObject2.sum(2,4));

        Fi labmda1=a->a*a;
        Fi labmda12=(a)->a*a;



    }

}


@FunctionalInterface
interface I{

    int sum(int a, int b);


}
@FunctionalInterface
interface Fi{

    int kavadrat(int a);


}
abstract class A{



}

