public class Plant {
    String color;
    double waterAmount;
    double absorb;

    public Plant() {

    }

    public Plant(String color) {
        this.color = color;
        this.waterAmount = 0;
    }

    public void addWater(int water) {
        waterAmount += water * absorb;

    }
}
