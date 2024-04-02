package Funtional_Interface; // functional interface is also known as SAM interface.
// functional interface can have only one abstract method but it can have multiple static or default method.
@FunctionalInterface
interface Functional
{
    public int operation(int a,int b);
}
public class Runner {
    public static void main(String[] args) {
        Functional  functional= (a,b)->a+b;
        System.out.println(functional.operation(2,6));

        functional= (a,b)->a*b;
        System.out.println(functional.operation(4,5));
    }
}
