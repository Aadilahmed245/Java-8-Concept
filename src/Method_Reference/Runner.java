package Method_Reference;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6);
        list.forEach(System.out::println);
                    // this is called method referencing (::)
    }
}
