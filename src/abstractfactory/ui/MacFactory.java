package abstractfactory.ui;

public class MacFactory implements IFactory {

    @Override
    public ITextbox createTextbox() {
       return new MacTextBox();
    }

    @Override
    public IButton createButton() {
        return new MacButton();
    }
    
}
