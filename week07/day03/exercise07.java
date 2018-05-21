import java.util.Map;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class exercise07 {

    public static void main(String[] args) {

        String something = "FdogWHdababofgGgIiEeRBSD";

        Map<Character, Long> characterFrequency = something.toLowerCase().chars()
                .mapToObj(c -> (char) c)
                .collect(groupingBy(c -> c, counting()));
        System.out.println(characterFrequency);

    }


}
