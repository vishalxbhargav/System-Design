package builder.car;

public class Car {
    private String engine;
    private String transmission;
    private String seats;
    private String gps;
    private String sunroof;

    public void display() {
        System.out.println("Car Specs:");
        System.out.println("Engine: " + engine);
        System.out.println("Transmission: " + transmission);
        System.out.println("Seats: " + seats);
        System.out.println("GPS: " + gps);
        System.out.println("Sunroof: " + sunroof);
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    public String getSunroof() {
        return sunroof;
    }

    public void setSunroof(String sunroof) {
        this.sunroof = sunroof;
    }
}
