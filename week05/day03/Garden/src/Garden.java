import java.util.ArrayList;
import java.util.List;

public class Garden {
    List<Tree> trees;
    List<Flower> flowers;

    public Garden() {
        this.flowers = new ArrayList<>();
        this.trees = new ArrayList<>();
    }

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public void addTree(Tree tree) {
        trees.add(tree);
    }

    public void showGarden() {
        for (Flower flower : flowers) {
            if (flower.waterAmount < 5) {
                System.out.println("The " + flower.color + " Flower needs water");
            } else {
                System.out.println("The " + flower.color + " Flower doesnt needs water");
            }
        }

        for (Tree tree : trees) {
            if (tree.waterAmount < 5) {
                System.out.println("The " + tree.color + " Tree needs water");
            } else {
                System.out.println("The " + tree.color + " Tree doesnt needs water");
            }
        }
    }

    public void waterGarden(int waterAmount) {
        int needWater = 0;
        for (Flower flower : flowers) {
            if (flower.waterAmount < 5) {
                needWater += 1;
            }
        }

        for (Tree tree : trees) {
            if (tree.waterAmount < 10) {
                needWater += 1;
            }
        }

        if (needWater > 0){
            for (Flower flower : flowers) {
                flower.addWater(waterAmount/needWater);
            }

            for (Tree tree : trees) {
                tree.addWater(waterAmount/needWater);
            }

        }

        System.out.println("");
        System.out.println("Watering with: " + waterAmount);
        showGarden();
    }
}
