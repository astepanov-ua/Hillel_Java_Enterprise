package SOLID.VehicleServiceWorkers;

import SOLID.Vehicles.Vehicle;

import java.math.BigDecimal;

public class Cleaner extends AbstractWorker {

    public Cleaner() {
    }

    public Cleaner(String name, BigDecimal wage) {
    }

    @Override
    public void work(Vehicle vehicle) {
        clean(vehicle);
    }

    private Vehicle clean(Vehicle vehicle) {
        if (!vehicle.isClean()) {
            //do some logic
            vehicle.setClean(true);
        }
        return vehicle;
    }
}
