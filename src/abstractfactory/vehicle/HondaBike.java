package abstractfactory.vehicle;

public class HondaBike implements IBike {

    @Override
    public void carCompany() {
        System.out.println("Honda");
    }

    @Override
    public int numOfWheel() {
        return 2;
    }

    @Override
    public int numOfSeat() {
        return 3;
    }

    @Override
    public void vehicaleType() {
        System.out.println("Honda Bike");
    }
    
}
