package builder.car;

public class CarDirector {
    public Car buildCar(CarBuilder builder) {
        return builder.buildEngine()
                      .buildTransmission()
                      .buildSeats()
                      .buildGps()
                      .buildSunroof()
                      .getCar();
    }
}

