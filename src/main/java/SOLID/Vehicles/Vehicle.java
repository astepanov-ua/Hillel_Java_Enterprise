package SOLID.Vehicles;

import SOLID.VehicleServices.Repairing.Repairable;

public abstract class Vehicle implements Repairable {
    enum vehiсleType {Truck, Passenger, Moto;}
    String brand;
    private boolean isClean = false;
    private boolean isWashed = false;
    private boolean isChecked = false;
    public String getBrand() {
        return brand;
    }
    public boolean isClean() {
        return isClean;
    }
    public void setClean(boolean clean) {
        isClean = clean;
    }
    public boolean isWashed() {
        return isWashed;
    }
    public void setWashed(boolean washed) {isWashed = washed;}
    public boolean isChecked() {
        return isChecked;
    }
    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    @Override
    public String toString() {
        return  "{brand='" + brand + '\'' +
                ", isClean=" + isClean +
                ", isWashed=" + isWashed +
                ", isChecked=" + isChecked +
                '}';
    }
}
