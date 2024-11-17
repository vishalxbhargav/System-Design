package abstractfactory.ui;

public class MacButton implements IButton {
    @Override
    public void press() {
        System.out.println("MacButton press");
    }
}
