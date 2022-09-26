package day09_ternary_Switch;

public class C03_Ternary {

    public static void main(String[] args) {


    int sayı=20;
    //Verilen sayının 3 veya daha cok basamaklı olup olmadıgını kontrol eden
    //ve sonucu yazdıran bir Ternary olusturun


   String sonuc= sayı>=100 ? "Sayı 3 basamaklı veya daha buyuk" :"sayı negatif veya 3 basamaktan kucuk";

   //Ternary bize sonuc dondurdugu icin
   //ya bu sonucu direkt yazdırmalıyız
   //ya da sonucun data turune uygun bir variable'a atama yapabiliriz

        System.out.println("Girdiginiz sayı analizi:"+sonuc);



    }


}
