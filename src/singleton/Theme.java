package singleton;

enum Mode{
    Dark,Light,System,
}

public class Theme {
    private static Mode mode= Mode.System;
    static Theme theme=null;
    private Theme(){}
    public  void setTheme(Mode mode){
        Theme.mode=mode;
    }
    public  Mode getTheme(){
        return mode;
    }
    public static Theme getInstance(){
        if(theme==null) return new Theme();
        return theme;
    }
}
