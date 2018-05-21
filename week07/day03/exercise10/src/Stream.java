import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

    public static void main(String[] args) {
        List<Fox> foxList = new ArrayList<Fox>();
        foxList.add(new Fox("Foxy", "Fennec Fox", "white"));
        foxList.add(new Fox("Vulpix", "Red Fox", "red"));
        foxList.add(new Fox("Sparky", "Marble Fox", "grey"));
        foxList.add(new Fox("Tod", "Gray Fox", "grey"));
        foxList.add(new Fox("Ruby", "Silver Fox", "silver"));
        foxList.add(new Fox("Greeny", "Pallida", "green"));

        List<Fox> greenFoxes = foxList.stream()
                .filter(f -> f.color.equals("green"))
                .collect(Collectors.toList());
        System.out.println("Foxes with green color:\n" + greenFoxes);

        List<Fox> greenPallidaFoxes = foxList.stream()
                .filter(f -> f.color.equals("green") && f.type.equals("Pallida"))
                .collect(Collectors.toList());
        System.out.println("\nPallida foxes with green color:\n" + greenPallidaFoxes);


    }


}
