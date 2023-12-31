package task2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Pr {
    public static void pr(Integer[] integers){
        List<Integer> list = Arrays.asList(integers);
        Predicate<Integer> predicate = x -> x % 2 == 0;
        list.stream().filter(predicate)
                .forEach(System.out::println);
    }
}
