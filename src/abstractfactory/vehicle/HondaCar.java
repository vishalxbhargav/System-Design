package abstractfactory.vehicle;

public class HondaCar implements ICar {

    @Override
    public void carCompany() {
       System.out.println("Honda");
    }

    @Override
    public int numOfWheel() {
        return 4;
    }

    @Override
    public int numOfSeat() {
       return 6;
    }

    @Override
    public void vehicaleType() {
        System.out.println("Honda Car");
    }
    
}
