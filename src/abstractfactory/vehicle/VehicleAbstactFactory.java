package abstractfactory.vehicle;

public class VehicleAbstactFactory {
    public static IFactory creFactory(String vehicle){
        if(vehicle.equalsIgnoreCase("Honda")) return new HondaFactory();
        else if(vehicle.equalsIgnoreCase("BMW")) return new BMWFactory();
        return null;
    } 
}
