package abstractfactory.ui;

public class GUIAbstractFactory {
    public static IFactory creaFactory(String osType){
        if(osType.equals("windows")) return new WinFactory();
        else if(osType.equals("mac")) return new MacFactory();
        return null;
    }
}
