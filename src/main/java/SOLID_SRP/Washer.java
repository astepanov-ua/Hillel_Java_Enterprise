package SOLID_SRP;

public class Washer {
    public Washer() {
    }

    public Car wash(Car car) {
        if (!car.isWashed()) {
            //do smth
            car.setWashed(true);
        }
        return car;
    }
}
