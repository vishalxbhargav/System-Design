package builder.car;

public class LuxuryCarBuilder extends CarBuilder {
    public CarBuilder buildEngine() {
        car.setEngine("V8 Engine");
        return this;
    }

    public CarBuilder buildTransmission() {
        car.setTransmission("Automatic Transmission");
        return this;
    }

    public CarBuilder buildSeats() {
        car.setSeats("Leather Seats");
        return this;
    }

    public CarBuilder buildGps() {
        car.setGps("Advanced GPS");
        return this;
    }

    public CarBuilder buildSunroof() {
        car.setSunroof("Panoramic Sunroof");
        return this;
    }
}
