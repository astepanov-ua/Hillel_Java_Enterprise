package SOLID.VehicleServiceWorkers;

import SOLID.Vehicles.Vehicle;

import java.math.BigDecimal;
import java.util.Objects;

abstract public class AbstractWorker {
    private String name;
    private BigDecimal wage;

    public AbstractWorker() {}

    public AbstractWorker(String name, BigDecimal wage) {
        this.name = name;
        this.wage = wage;
    }

    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }
    BigDecimal getWage() {
        return wage;
    }
    void setWage(BigDecimal wage) {
        this.wage = wage;
    }


    public abstract void work(Vehicle vehicle);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractWorker abstractWorker = (AbstractWorker) o;
        return name.equals(abstractWorker.name) &&
                wage.equals(abstractWorker.wage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, wage);
    }
}
