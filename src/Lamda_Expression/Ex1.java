package Lamda_Expression;
interface  Function
{
    public int operation(int a,int b);
}
public class Ex1 {
    public static void main(String[] args) {
        Function sum= (a,b)->a+b;
        System.out.println("Sum Of Numbers="+sum.operation(3,6));

        Function prod= (a,b)->a*b;
        System.out.println("Product of Numbers="+prod.operation(3,6));
    }
}
