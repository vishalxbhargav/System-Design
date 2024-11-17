package abstractfactory.vehicle;

public class BMWFactory implements IFactory {

    @Override
    public ICar createCar() {
        return new BMWCar();
    }
    @Override
    public IBike creaBike() {
       return new BMWBike();
    }
    
}
