package day34_accessModifier_encapsulation;

public class C01 {

    private static int sayı=10;
    private static String str="java";
    static int acıkSayı=20;////access modifier'i default access modifier'dır
    String acıkString="Hi";//access modifier'i default access modifier'dır
    public static int halkaAcıkSayı=15;
    protected static int aileyeOzel=40;
    protected C01(){
        //Bu constructor'ın access modifier'ı
        //default access modifier'dır
        //dolayısıyla icinde oldugumuz paketin dısında
        //bu class'dan obje olusturulamaz
    }

    private C01(int numara){
        System.out.println("Parametreli constructor Calıstı");
    }

    private void method1(){

    }

}
