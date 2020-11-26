package SOLID.VehicleServices;

import SOLID.VehicleServiceWorkers.Washer;
import SOLID.Vehicles.Vehicle;

public class CarWashing extends CarService {
    public CarWashing() {
        worker = new Washer();
    }

    @Override
    public void perform(Vehicle vehicle) {
        worker.work(vehicle);
    }
}
