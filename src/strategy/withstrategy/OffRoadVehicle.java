package strategy.withstrategy;

import strategy.withstrategy.strategycode.SportsDrive;

public class OffRoadVehicle extends Vehicle{

    OffRoadVehicle() {
        super(new SportsDrive());
    }
    
}
