package SOLID;

import SOLID.VehicleServiceStations.CarServiceStation;
import SOLID.VehicleServices.CarChecking;
import SOLID.VehicleServices.CarCleaning;
import SOLID.VehicleServices.CarWashing;
import SOLID.Vehicles.PassengerCar;
import SOLID.Vehicles.Truck;
import SOLID.Vehicles.Vehicle;

import java.util.List;

public class MainApp {
    /**
     * SOLID
     * S - sinle responsibility:
     *     realised in VehicleServiceWorkers classes - every worker response for only single action
     * O - open/closed principle:
     *     realised in CarServiceStation.Class - when we add some new service in a list of services
     *                                           (CAR_SERVICE_STATION.addService())
     *                                           we modify class without changing his own code
     * L - Liskov principle:
     *     realised in CAR_SERVICE_STATION.doAllServices()
     *                                       - we can work with any VehicleService and any Vehicle in this method
     *                                       according to implementation of interfaces VehicleServiceStation
     *                                       and VehicleService
     * I - Interface Segregation:
     *     realised in VehicleServices - Vehicle implements Repairable,
     *                                   Truck and PassengerCar implements Towable,
     *                                   is but Truck is not ReChargeable, only PassengerCar
     *                                   - so method repair() in both consider different logic,
     *                                   but it is easy to call repair() and guarantee to have result
     *                                   - if interface Repairable would contained with both methods (tow() and recharge())
     *                                   it would be necessary to make stub in Truck implementation of method recharge()
     * D - Dependency Inversion:
     *     realised in class CarServiceStation - as an implementation of VehicleServiceStation this class can accept and
     *                                           realize its implementation of .doAllServices() because of all Services
     *                                           this Class receive in List in its Constructor implements VehicleService.
     *
     */

    public static final CarServiceStation CAR_SERVICE_STATION =
            new CarServiceStation(List.of(new CarChecking(), new CarWashing(), new CarCleaning()));

    public static void main(String[] args) {
        Vehicle cabrio = new PassengerCar("cabrio");
        Vehicle truck = new Truck("MAN");
        Vehicle roadster = new PassengerCar("roadster");

        System.out.println(cabrio);
        System.out.println(truck);
        System.out.println(roadster);

        if (CAR_SERVICE_STATION.canAcceptForService(cabrio)) {
            CAR_SERVICE_STATION.doAllServices();
        }

        if (CAR_SERVICE_STATION.canAcceptForService(roadster)) {
            CAR_SERVICE_STATION.doAllServices();
        }

        if (CAR_SERVICE_STATION.canAcceptForService(truck)) {
            CAR_SERVICE_STATION.doAllServices();
        }
        CAR_SERVICE_STATION.giveBack();

        System.out.println(cabrio);
    }
}
