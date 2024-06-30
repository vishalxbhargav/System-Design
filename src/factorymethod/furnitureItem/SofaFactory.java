package factorymethod.furnitureItem;

public class SofaFactory implements FurnitureFactory {

    @Override
    public FurnitureItem createFurnitureItem() {
        return new Sofa();
    }
    
}
