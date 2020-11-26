package SOLID.VehicleServices;

import SOLID.VehicleServiceWorkers.AbstractWorker;

import java.util.Objects;

public abstract class CarService implements VehicleService {

    AbstractWorker worker;

    CarService() {}

    CarService(AbstractWorker worker  ) {
        this.worker = worker;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarService that = (CarService) o;
        return worker.equals(that.worker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(worker);
    }
}
