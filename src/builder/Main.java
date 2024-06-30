package builder;

import builder.car.*;
import builder.car.LuxuryCarBuilder;
import builder.desktop.DellDesktopBuilder;
import builder.desktop.Desktop;
import builder.desktop.DesktopDirector;
import builder.desktop.HpDesktopBuilder;

public class Main {
    public static void main(String[] args) {

        //Desktop
        // DesktopDirector director=new DesktopDirector();
        // DellDesktopBuilder dellDesktopBuilder=new DellDesktopBuilder();
        // HpDesktopBuilder hpDesktopBuilder=new HpDesktopBuilder();
        // Desktop dellDesktop=director.builDesktop(dellDesktopBuilder);
        // Desktop hDesktop=director.builDesktop(hpDesktopBuilder);
        // dellDesktop.display();
        // hDesktop.display();

        CarDirector director=new CarDirector();
        LuxuryCarBuilder luxuryCarBuilder=new LuxuryCarBuilder();
        EconomyCarBuilder economyCarBuilder=new EconomyCarBuilder();
        Car economyCar=director.buildCar(economyCarBuilder);
        Car luxuryCar=director.buildCar(luxuryCarBuilder);

        luxuryCar.display();
        economyCar.display();


    }
}
