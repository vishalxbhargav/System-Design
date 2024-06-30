package abstractfactory.vehicle;

public class BMWCar implements ICar {

    @Override
    public void carCompany() {
       System.out.println("BMW Company");
    }

    @Override
    public int numOfWheel() {
        return 4;
    }

    @Override
    public int numOfSeat() {
        return 8;
    }

    @Override
    public void vehicaleType() {
        System.out.println("BMW Car");
    }
    
}
