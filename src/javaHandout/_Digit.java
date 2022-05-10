package javaHandout;

public class _Digit extends _Character{

    public _Digit(char ch) {
        this.ch = ch;
        objectCounter++;
    }
    public _Digit()
    {}



    protected _Character plus(_Character arg){
        _Character new_obj= new _Character((char) ((((this.ch+arg.ch)%48)%10)+48));
        return new_obj;
    }

}
