package co.devfoundry.cars;

public abstract class Factory {
    abstract public Car buildBMW(BMWModel model);
    abstract public Car buildFord(FordModel model);

}
