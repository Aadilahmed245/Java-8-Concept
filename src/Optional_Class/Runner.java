package Optional_Class;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Runner {
    public static void main(String[] args) {
        List<Integer> list = List.of(4,7,12,32,2,21);
        Optional<Integer> optionalI = list.stream().min(Comparator.naturalOrder());
        if(optionalI.isPresent())
        {
            System.out.println("Min of numbers is "+optionalI.get());
        }
        List<Integer> list1 = List.of(4,7,12,32,2,21);
        Optional<Integer> optional1 = list1.stream().max(Comparator.naturalOrder());
        if(optional1.isPresent())
        {
            System.out.println("Max of numbers is "+optional1.get());
        }

    }
}
