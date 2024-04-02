package Stream_API.Intermediate_Operation;

import java.util.List;

public class Map {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6);
        list.stream().map(e->2*e).forEach(System.out::println);
    }
}
