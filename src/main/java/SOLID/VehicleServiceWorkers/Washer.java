package SOLID.VehicleServiceWorkers;

import SOLID.Vehicles.Vehicle;

import java.math.BigDecimal;

public class Washer extends AbstractWorker {

    public Washer() {
    }

    public Washer(String name, BigDecimal wage) {
    }

    @Override
    public void work(Vehicle vehicle) {
        wash(vehicle);
    }

    private Vehicle wash(Vehicle vehicle) {
        if (!vehicle.isWashed()) {
            //do smth
            vehicle.setWashed(true);
        }
        return vehicle;
    }
}
