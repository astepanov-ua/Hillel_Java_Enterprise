package SOLID_SRP;

public class Administrator extends CarStationWorker {
    public boolean getCar (Car car){
        return (car.getType()!="truck");
    }
    public Car giveCarAway(Car car){
        return car;
    }

    public void printResult(){
        System.out.println("car is ready");
    }
}
