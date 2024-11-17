package strategy.withstrategy;

import strategy.withstrategy.strategycode.SportsDrive;

public class SportsVehicle extends Vehicle {
    public SportsVehicle() {
        super(new SportsDrive());  
    }    
}
