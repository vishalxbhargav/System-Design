package strategy.withstrategy;

import strategy.withstrategy.strategycode.NormalDrive;

public class GoodsVehicle extends Vehicle {

    GoodsVehicle() {
        super(new NormalDrive());
    }
    
}
