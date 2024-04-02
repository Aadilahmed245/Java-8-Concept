package Lamda_Expression;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();

        for(int i=1;i<=10;i++)
        {
            list.add(i);
        }
        list.forEach(element->System.out.println(element));
    }
}
