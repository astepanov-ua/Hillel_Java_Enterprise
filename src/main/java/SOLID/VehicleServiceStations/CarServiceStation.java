package SOLID.VehicleServiceStations;

import SOLID.VehicleServices.Repairing.Repairable;
import SOLID.VehicleServices.VehicleService;
import SOLID.Vehicles.PassengerCar;
import SOLID.Vehicles.Vehicle;

import java.util.List;


public class CarServiceStation implements VehicleServiceStation {

    private Vehicle vehicle;
    private boolean isBusy = false;

    public CarServiceStation(List<VehicleService> services) {
        this.services.addAll(services);
    }

    @Override
    public boolean canAcceptForService(Vehicle vehicle) {
        if (!(vehicle instanceof PassengerCar)) {
            System.out.println("Vehicle is not passanger");
            return false;
        }
        if (services.size() == 0) {
            System.out.println("CSS has no services now.");
            return false;
        }
        if (isBusy) {
            System.out.println("CSS is Busy now.");
            return false;
        }
        this.vehicle = vehicle;
        isBusy = true;
        return true;
    }
    
    @Override
    public void doAllServices()   {
        for (VehicleService service : services) {
            service.perform(vehicle);
        }
    }

    @Override
    public Vehicle giveBack() {
        isBusy = false;
        return vehicle;
    }

    @Override
    public List<VehicleService> addService(VehicleService newVehicleService) {
        services.add(newVehicleService);
        return services;
    }

    @Override
    public boolean deleteService(VehicleService vehicleService) {
        return services.remove(vehicleService);
    }

    @Override
    public void repair(Repairable vehicle) {
        vehicle.repair();
    }
}