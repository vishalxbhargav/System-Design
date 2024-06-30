package abstractfactory.vehicle;

public class HondaFactory implements IFactory {
    @Override
    public ICar createCar() {
        return new HondaCar();
    }
    @Override
    public IBike creaBike() {
       return new HondaBike();
    }
}
