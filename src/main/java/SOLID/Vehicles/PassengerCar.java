package SOLID.Vehicles;

import SOLID.VehicleServices.Recharging.Rechargeable;
import SOLID.VehicleServices.Towable.Towable;

public class PassengerCar extends Vehicle implements Towable, Rechargeable {
    public PassengerCar(String brand) {
        super.brand = brand;
    }


    @Override
    public String toString() {
        return "PassengerCar " + super.toString();
    }

    @Override
    public void repair() {
        //logic tow() or/and recharge()
    }

    @Override
    public void tow() {
        //some logic
    }

    @Override
    public void recharge() {
        //some logic
    }
}



