package SOLID.VehicleServiceWorkers;

import SOLID.Vehicles.Vehicle;

import java.math.BigDecimal;

public class CheckMaster extends AbstractWorker {
    public CheckMaster() {}
    public CheckMaster(String name, BigDecimal wage) {
        super(name, wage);
    }

    @Override
    public void work(Vehicle vehicle) {
         check(vehicle);
    }

    private Vehicle check(Vehicle vehicle) {
        System.out.println(vehicle);
        if (!vehicle.isChecked()) {
            //do smth
            vehicle.setChecked(true);
        }
        return vehicle;
    }
}
