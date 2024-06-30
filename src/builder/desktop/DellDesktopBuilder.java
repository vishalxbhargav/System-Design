package builder.desktop;

public class DellDesktopBuilder extends DesktopBuilder {

    @Override
    public void buildMotherboard() {
       desktop.setMotherboard("Dell Motherboard");
    }

    @Override
    public void buildProcessor() {
        desktop.setProcessor("Intel Core i5 12gen");
    }

    @Override
    public void buildMemory() {
        desktop.setMemory("32GB DDR4 RAM");
    }

    @Override
    public void buildStorage() {
       desktop.setStorage("1TB SSD + 2TB HDD");
    }

    @Override
    public void buildGraphicsCard() {
        desktop.setGraphicsCard("NVIDIA RTX 4050i");
    }
    
}
