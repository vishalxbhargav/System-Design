package builder.car;

public class EconomyCarBuilder extends CarBuilder {
    public CarBuilder buildEngine() {
        car.setEngine("I4 Engine");
        return this;
    }

    public CarBuilder buildTransmission() {
        car.setTransmission("Manual Transmission");
        return this;
    }

    public CarBuilder buildSeats() {
        car.setSeats("Cloth Seats");
        return this;
    }

    public CarBuilder buildGps() {
        car.setGps("Basic GPS");
        return this;
    }

    public CarBuilder buildSunroof() {
        car.setSunroof("No Sunroof");
        return this;
    }
}

