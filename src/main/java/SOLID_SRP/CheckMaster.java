package SOLID_SRP;

public class CheckMaster extends CarStationWorker {
    public Car check(Car car) {
        if (!car.isChecked()) {
            //do smth
            car.setChecked(true);
        }
        return car;
    }
}
