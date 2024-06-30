package factorymethod;

import factorymethod.furnitureItem.ChairFactory;
import factorymethod.furnitureItem.FurnitureFactory;
import factorymethod.furnitureItem.FurnitureItem;
import factorymethod.furnitureItem.SofaFactory;
import factorymethod.furnitureItem.TableFactory;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory sofaFactory=new SofaFactory();
        FurnitureFactory chairFactory= new ChairFactory();
        FurnitureFactory tableFactory = new TableFactory(); 
        // Create furniture objects using the factory methods
        FurnitureItem sofa = sofaFactory.createFurnitureItem();
        FurnitureItem chair = chairFactory.createFurnitureItem();
        FurnitureItem table = tableFactory.createFurnitureItem();
        // Display the created furniture items
        sofa.display();
        chair.display();
        table.display();
    }
}
