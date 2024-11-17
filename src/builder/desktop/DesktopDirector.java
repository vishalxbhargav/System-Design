package builder.desktop;

public class DesktopDirector {
    public Desktop builDesktop(DesktopBuilder builder){
        builder.buildMotherboard();
        builder.buildProcessor();
        builder.buildMemory();
        builder.buildStorage();
        builder.buildGraphicsCard();
        return builder.getDesktop();
    }
}
