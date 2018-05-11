import java.util.ArrayList;
import java.util.List;

public class SharpeiSet {
    List<Sharpei> sharpeis;


    public SharpeiSet() {
        this.sharpeis = new ArrayList<>();

    }

    public void add(Sharpei sharpei) {
        sharpeis.add(sharpei);
    }


    public int countUsable() {
        int count = 0;
        for (Sharpei sharpei : this.sharpeis) {
            if (sharpei.inkAmount > 0) {
                count++;
            }
        }
        return count;

    }

    public void removeTrash() {
        for (Sharpei sharpei : this.sharpeis) {
            if (sharpei.inkAmount == 0) {
                sharpeis.remove(sharpei);
            }
        }

    }
}
