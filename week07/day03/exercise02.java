import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class exercise02 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

        double average = numbers.stream()
                .filter(x -> x % 2 != 0)
                .mapToInt(val -> val)
                .average()
                .getAsDouble();

        System.out.println(average);


    }

}
