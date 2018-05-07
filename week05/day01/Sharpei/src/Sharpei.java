public class Sharpei {
    String color;
    double width;
    double inkAmount;

    public Sharpei() {
        this.inkAmount = 100.0;
    }

    public Sharpei(String color, double width) {
        this.color = color;
        this.width = width;
    }

    public void use() {
        this.inkAmount -= 1;
    }
}
