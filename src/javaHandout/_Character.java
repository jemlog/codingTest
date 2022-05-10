package javaHandout;

public class _Character extends Object{

    protected char ch;
    public static int objectCounter = 0;
    public _Character(char ch) {
        this.ch = ch;
        objectCounter++;
    }

    public _Character(){
       objectCounter++;
    }

    protected _Character plus(_Character arg)
    {
        _Character character = new _Character((char)((this.ch + arg.ch) % 65 + 65));
        return character;
    }

    public char getCh()
    {
        return ch;
    }

    public void setCh(char ch)
    {
        this.ch =ch;
    }


}
