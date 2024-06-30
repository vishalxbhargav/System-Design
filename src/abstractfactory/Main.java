package abstractfactory;

import java.util.Scanner;

import abstractfactory.ui.GUIAbstractFactory;
import abstractfactory.ui.IButton;
// import abstractfactory.ui.IFactory;
import abstractfactory.ui.ITextbox;
import abstractfactory.vehicle.IBike;
import abstractfactory.vehicle.ICar;
import abstractfactory.vehicle.IFactory;
import abstractfactory.vehicle.VehicleAbstactFactory;

public class Main {
    public static void main(String[] args) {
    //    System.out.print("Enter machine os : ");
    //    Scanner sc=new Scanner(System.in);
    //    String osType=sc.nextLine();
    //    sc.close();
    //    IFactory factory=GUIAbstractFactory.creaFactory(osType);
    //    if(factory!=null){
    //     IButton button=factory.createButton();
    //     button.press();
    //     ITextbox textbox=factory.createTextbox();
    //     textbox.settext();
    //    }else{
    //     System.out.println("Invalid os type");
    //    }
        System.out.print("Enter vehcle company : ");
        Scanner sc=new Scanner(System.in);
        String company=sc.nextLine();
        sc.close();
        IFactory vehicle=VehicleAbstactFactory.creFactory(company);
        if(vehicle!=null){
            ICar car=vehicle.createCar();
            car.vehicaleType();
            car.carCompany();
            System.out.println("Number of Wheel : "+car.numOfWheel());
            System.out.println("Number of Seat : "+car.numOfSeat());

            IBike bike=vehicle.creaBike();
            bike.vehicaleType();
            bike.carCompany();
            System.out.println("Number of Wheel : "+bike.numOfWheel());
            System.out.println("Number of Seat : "+bike.numOfSeat());
       }else{
        System.out.println("Invalid vehicle type");
       }
    }
}
