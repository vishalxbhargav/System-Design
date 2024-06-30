package abstractfactory.vehicle;

public class BMWBike implements IBike {

    @Override
    public void carCompany() {
       System.out.println("BMW bike");
    }
    @Override
    public int numOfWheel() {
        return 2;
    }

    @Override
    public int numOfSeat() {
       return 2;
    }
    @Override
    public void vehicaleType() {
        System.out.println("BMW Bike");
    }
    
}
