package SOLID.VehicleServices;

import SOLID.VehicleServiceWorkers.CheckMaster;
import SOLID.Vehicles.Vehicle;

public class CarChecking extends CarService {
    public CarChecking() {
        worker = new CheckMaster();
    }

    @Override
    public void perform(Vehicle vehicle) {
        worker.work(vehicle);
    }
}
