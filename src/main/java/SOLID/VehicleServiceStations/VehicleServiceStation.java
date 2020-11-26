package SOLID.VehicleServiceStations;

import SOLID.VehicleServices.Repairing.Repairable;
import SOLID.VehicleServices.VehicleService;
import SOLID.Vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

interface VehicleServiceStation {
     Vehicle vehicle = null;
     List<VehicleService> services = new ArrayList<>();
     boolean canAcceptForService(Vehicle vehicle);
     void doAllServices();
     Vehicle giveBack();
     List<VehicleService> addService(VehicleService newVehicleService);
     boolean deleteService(VehicleService newVehicleService);
     void repair (Repairable vehicle);
}
