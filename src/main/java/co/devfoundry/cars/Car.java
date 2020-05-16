package co.devfoundry.cars;

public class Car {

    private double engineCapacity;
    private String fuel;
    private int productionYear;
    private String SteeringWheelPosition;

    public Car(double engineCapacity, String fuel, int productionYear, String steeringWheelPosition) {
        this.engineCapacity = engineCapacity;
        this.fuel = fuel;
        this.productionYear = productionYear;
        SteeringWheelPosition = steeringWheelPosition;
    }

    public String getSteeringWheelPosition() {
        return SteeringWheelPosition;
    }
}
