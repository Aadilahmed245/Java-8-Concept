package Stream_API.Intermediate_Operation;

import java.util.List;

public class Filter {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6);
        list.stream().filter(value->value%2==0)
                .forEach(System.out::println);
    }
}
