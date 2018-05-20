public class exercise05 {

    public static void main(String[] args) {

        String something = "FdogWHdofgRBSD";

        something.chars()
                .filter(c -> c > 64 && c < 91)
                .mapToObj(c -> Character.toString((char)c))
                        .forEach(System.out::println);


    }


}
