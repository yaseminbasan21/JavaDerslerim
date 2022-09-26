package day09_ternary_Switch;

public class C05_Ternary {

    public static void main(String[] args) {

        //Bazen Ternary'deki iki sonucun data turleri farklı olabilir

        //Verilen sayı 100'den buyukse sayının karesini alıp yazdıran
        //100'den kucukse "sayı 100'den buyuk olmalı" yazdıran bir Ternary olusturalım

        int sayı=50;
        //ternary bize sonuc getirdiginden ya sonucu direkt yazdırmalıyız
        //veya bir degiskene atamalıyız
        //Eger sonuclar farklı data turlerinde ise
        //atama yapacagımız variable'ın data turu tek olacagından
        //atama yapamayız
        //Sadece direkt yazdırabiliriz

        System.out.println(sayı>100 ? sayı*sayı : "sayı 100'den buyuk olmalı");



    }




}
