package SOLID_SRP;

public class CarServiceStation {
    private Washer washer;
    private Cleaner cleaner;
    private CheckMaster checkMaster;
    private Administrator administrator;
    private Car car;

    public CarServiceStation(Washer washer,
                             Cleaner cleaner,
                             CheckMaster checkMaster,
                             Administrator administrator) {
        this.washer = washer;
        this.cleaner = cleaner;
        this.checkMaster = checkMaster;
        this.administrator = administrator;
    }

    public boolean takeCar(Car car) {
        if (administrator.getCar(car)) {
            this.car = car;
            return true;
        }
        return false;
    }

    public Car wash() {
        return washer.wash(car);
    }

    public Car clean() {
        return cleaner.clean(car);
    }

    public Car check() {
        return checkMaster.check(car);
    }

    public Car giveCarAway() {
        administrator.printResult();
        return administrator.giveCarAway(car);
    }
}

