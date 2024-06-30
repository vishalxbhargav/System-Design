package abstractfactory.ui;

public class WinFactory implements IFactory {

    @Override
    public ITextbox createTextbox() {
        return new WinTextBox();
    }

    @Override
    public IButton createButton() {
        return new WinButton();
    }
    
}
