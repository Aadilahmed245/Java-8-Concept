package Stream_API.Intermediate_Operation;

import java.util.List;

public class Distinct {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,2,3,1,3,5,4,4,5,6);
        list.stream().distinct().forEach(System.out::println);
    }
}
