public class Fox {
    String name;
    String type;
    String color;

    public Fox(String name, String type, String color) {
        this.name = name;
        this.type = type;
        this.color = color;
    }


    @Override
    public String toString() {
        return String.format("Name: %s, Type: %s, Color: %s", name, type, color);
    }
}
