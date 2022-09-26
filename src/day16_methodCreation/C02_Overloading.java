package day16_methodCreation;

public class C02_Overloading {

    public static void main(String[] args) {

        String str="Bu da gecer ya huu";
        System.out.println(str.indexOf("d"));//3
        System.out.println(str.indexOf("a",5));//13
        System.out.println(str.indexOf('a',5));//13

       //Bir class'da aynı isimde birden fazla method olmasına overloading denir
       //ya parametre sayısı farklı olamlı
       //ya da parametre sayısı aynı ise argumentlerin data turleri farklı olmalı



    }

}
