package SOLID_SRP;

import java.math.BigDecimal;

abstract public class CarStationWorker {
    protected String name;
    protected BigDecimal wage;

    public CarStationWorker(String name, BigDecimal wage) {
        this.name = name;
        this.wage = wage;
    }
    public CarStationWorker() {
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getWage() {
        return wage;
    }

    public void setWage(BigDecimal wage) {
        this.wage = wage;
    }


}
