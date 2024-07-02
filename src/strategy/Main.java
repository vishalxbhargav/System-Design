package strategy;

import strategy.withoutstrategy.OffRoadVehicle;
import strategy.withoutstrategy.PassangerVehicle;
import strategy.withstrategy.SportsVehicle;

public class Main {
    public static void main(String[] args) { 
        SportsVehicle sportsVehicle=new SportsVehicle();
        OffRoadVehicle offRoadVehicle=new OffRoadVehicle();
        PassangerVehicle passangerVehicle=new PassangerVehicle();
        offRoadVehicle.drive();
        passangerVehicle.drive();
        sportsVehicle.drive();

    }
}
