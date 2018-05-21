import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;


import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class exercise08 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2));

        Map<Integer, Long> numberFrequency = numbers.stream().
                collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));
        System.out.println(numberFrequency);

    }


}

