package factorymethod.furnitureItem;

public class TableFactory implements FurnitureFactory {

    @Override
    public FurnitureItem createFurnitureItem() {
        return new Table();
    }
    
}
