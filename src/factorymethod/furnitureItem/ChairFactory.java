package factorymethod.furnitureItem;

public class ChairFactory implements FurnitureFactory {

    @Override
    public FurnitureItem createFurnitureItem() {
        return new Chair();
    }
    
}
