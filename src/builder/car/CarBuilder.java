package builder.car;

public abstract class CarBuilder {
    protected Car car = new Car();

    public abstract CarBuilder buildEngine();
    public abstract CarBuilder buildTransmission();
    public abstract CarBuilder buildSeats();
    public abstract CarBuilder buildGps();
    public abstract CarBuilder buildSunroof();

    public Car getCar() {
        return car;
    }
}

