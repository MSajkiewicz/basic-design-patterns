package co.devfoundry.cars;

public class CommonwealthFactory extends Factory {

    public Car buildBMW(BMWModel model) {
        switch (model) {
            case X5:
                return new Car(4.5, "ON", 2020, "Right");
            case E60:
                return new Car(2.0, "BP95", 2020, "Right");
            default:
                throw new UnsupportedOperationException("Wrong type");
        }
    }

    public Car buildFord(FordModel model) {
        switch (model) {
            case CMax:
                return new Car(1.5, "ON", 2020, "Right");
            case Focus:
                return new Car(1.0, "BP95", 2020, "Right");
            default:
                throw new UnsupportedOperationException("Wrong type");
        }
    }
}
