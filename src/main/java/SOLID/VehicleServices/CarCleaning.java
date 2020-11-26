package SOLID.VehicleServices;

import SOLID.VehicleServiceWorkers.Cleaner;
import SOLID.Vehicles.Vehicle;

public class CarCleaning extends CarService {
    public CarCleaning() {
        worker = new Cleaner();
    }

    @Override
    public void perform(Vehicle vehicle) {
        worker.work(vehicle);
    }
}
