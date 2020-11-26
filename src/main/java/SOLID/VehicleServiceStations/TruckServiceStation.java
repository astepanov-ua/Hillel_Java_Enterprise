package SOLID.VehicleServiceStations;

import SOLID.VehicleServices.Repairing.Repairable;
import SOLID.VehicleServices.VehicleService;
import SOLID.Vehicles.Vehicle;

import java.util.List;

public class TruckServiceStation  implements VehicleServiceStation{
    @Override
    public boolean canAcceptForService(Vehicle vehicle) {
        return false;
    }

    @Override
    public void doAllServices() {

    }

    @Override
    public Vehicle giveBack() {
        return null;
    }

    @Override
    public List<VehicleService> addService(VehicleService newVehicleService) {
        return null;
    }

    @Override
    public boolean deleteService(VehicleService newVehicleService) {
        return false;
    }

    @Override
    public void repair(Repairable vehicle) {

    }
}
