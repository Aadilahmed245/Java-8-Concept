package Stream_API.Intermediate_Operation;

import java.util.List;

public class Sorted {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6);
        list.stream().sorted().forEach(System.out::println);
    }
}
