package day11_StringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class C04_lenght {

    public static void main(String[] args) {

    //Kullanıcıdan ismini alıp baş harfini ve son harfini buyuk harflerle yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim= scan.nextLine();

        System.out.println("İlk harf: "+ isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(0));
        System.out.println("Son harf : "+isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(isim.length()-1));

        String str="";
        System.out.println(str.length());//0

        String str2=null;
        System.out.println(str2.length());//Calıstırıldıgında hata verir

        String str3;
       // System.out.println(str3);
       // str3 ile str2'ye deger atanmamıstır
       // str2 null pointer ile isaretlendiginden java durumun kontrol altında odugunu bilir
       //ve geriye kalan kodun calısmasına engel olmaz
       //ancak str3'e bir deger ataması olmayınca java altını kırmızı cizer
       //ve bu durum duzeltilinceye kadar kodun geriye kalanının calısmasınada izin vermez


    }





}
