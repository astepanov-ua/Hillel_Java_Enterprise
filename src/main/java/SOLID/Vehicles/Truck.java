package SOLID.Vehicles;

import SOLID.VehicleServices.Towable.Towable;

public class Truck extends Vehicle implements Towable {

    public Truck() {

    }

    public Truck(String brand) {
        super.brand=brand;
    }

    @Override
    public String toString() {
        return "Truck " + super.toString();
    }

    @Override
    public void repair() {
        tow();
    }

    @Override
    public void tow() {
        //some logic
    }
}
