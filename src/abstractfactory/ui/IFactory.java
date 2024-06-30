package abstractfactory.ui;

public interface IFactory {
    ITextbox createTextbox();
    IButton createButton();
}
