package SOLID_SRP;

public class Cleaner {
    public Car clean(Car car) {
        if (!car.isClean()){
            //do some logic
            car.setClean(true);
        }
        return car;
    }
}
