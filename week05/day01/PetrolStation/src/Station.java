public class Station {
    int gasAmount;

    public void refill(Car car) {
        this.gasAmount-=car.capacity;
        car.gasAmount+=car.capacity;

        System.out.println("Filled the car with " + car.capacity);

    }
}
