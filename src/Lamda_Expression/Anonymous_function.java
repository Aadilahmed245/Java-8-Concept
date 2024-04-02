package Lamda_Expression;


interface Test1
{
    void print();
}
public class Anonymous_function {
    static void fun(Test1 t)
    {
        t.print();
    }

    public static void main(String[] args) {
       // Test1 test= ()->System.out.print("hello");
        fun(()->System.out.println("HEllO"));
    }
}
