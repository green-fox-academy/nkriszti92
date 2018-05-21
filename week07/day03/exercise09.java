import java.util.Arrays;
import java.util.stream.Collectors;

public class exercise09 {
    public static void main(String[] args) {

        Character[] charArray = {'S', 'u', 'r', 'p', 'r', 'i', 's', 'e', '!'};

        String converted = Arrays.stream(charArray)
                .map(Object::toString)
                .collect(Collectors.joining());

        System.out.println(converted);
    }
}