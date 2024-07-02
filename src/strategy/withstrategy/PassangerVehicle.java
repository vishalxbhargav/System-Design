package strategy.withstrategy;

import strategy.withstrategy.strategycode.NormalDrive;

public class PassangerVehicle extends Vehicle {

    PassangerVehicle() {
        super(new NormalDrive());
    }
    
}
