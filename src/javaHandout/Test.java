package javaHandout;

public class Test {

    public static void main(String[] args) {

        _Character ch1=new _Character();
        _Character ch2=new _Character();
        _Digit di1=new _Digit();
        _Digit di2=new _Digit();
        _Letter le1=new _Letter();
        _Letter le2=new _Letter();
        _Vowel vo1=new _Vowel();
        _Vowel vo2=new _Vowel();
        _Consonant co1=new _Consonant();
        _Consonant co2=new _Consonant();
        System.out.println(_Character.objectCounter);
        _Character plus1=new _Digit('5');
        _Character plus2=new _Digit('6');
        System.out.println((plus1.plus(plus2)).ch);
        plus1.setCh('8');
        System.out.println(plus1.getCh());

    }
}
