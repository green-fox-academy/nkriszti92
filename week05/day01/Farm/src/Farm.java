import java.util.ArrayList;
import java.util.List;

public class Farm {
List<Animal> animals;
int slot;



public Farm(int slot) {
    this.animals = new ArrayList<>();
    this.slot=slot;
}

public void add(Animal animal) {
    animals.add(animal);
}

public void breed(){
    if (slot>0){
        animals.add(new Animal());
        slot --;
    }

}

    public void slaughter(){
    int leastHungry = animals.get(0).hunger;
    int index = 0;
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).hunger < leastHungry){
            leastHungry = animals.get(i).hunger;
            index= i;
            }

        }animals.remove(index);

    }

}




