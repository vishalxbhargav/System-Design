package singleton;

public class Main{
    public static void main(String[] args){
        Theme theme=Theme.getInstance();
        Theme theme1=Theme.getInstance();
        theme.setTheme(Mode.Dark);
        System.out.println(theme1.getTheme());
        theme1.setTheme(Mode.Light);
        System.out.println(theme.getTheme());
        System.out.println(theme1.getTheme());
    }
}