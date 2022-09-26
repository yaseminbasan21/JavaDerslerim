package day16_methodCreation;

import java.util.zip.ZipEntry;

public class C01_MethodIleSifreKontrol {

    public static void main(String[] args) {

    //Soru6) Kullanıcıdan bir sifre girmesini isteyin
    //Asagıdaki sartları saglıyorsa "Sıfre basarı ıle tanımlandı",
    //sartları saglamazsa "İslem basarısız,Lutfen yeni bir sifre girin" yazdırın
    // -Ilk harf buyuk harf olmalı
    // -Son harf kucuk harf olmalı
    // -Sifre bosluk icermemeli
    // -Sifre uzunlugu en az 8 karakter olmalı
    //bu 4 kontrolu method ile yapın

    String sifre="Asdf k";

    boolean ilkHarfKontrol=ilkHarfKontrolEt(sifre);
    boolean sonHarfKontrol=sonHarfKontrolEt(sifre);
    boolean boslukKontrol=boslukKontrolEt(sifre);
    boolean uzunlukKontrol=uzunlukKontrolEt(sifre);

    if (ilkHarfKontrol&&sonHarfKontrol&&boslukKontrol&&uzunlukKontrol){
        System.out.println("Sıfre basarı ıle tanımlandı");
    }else {
        System.out.println("İslem basarısız,Lutfen yeni bir sifre girin");
    }

    }

    private static boolean uzunlukKontrolEt(String sifre) {
        boolean uzunlukKontrolSonuc=false;

        if (sifre.length()>=8){
            uzunlukKontrolSonuc=true;
        }else {
            System.out.println("Sifreniz en az 8 karakter icermeli");
            uzunlukKontrolSonuc=false;
        }

        return uzunlukKontrolSonuc;
    }

    private static boolean boslukKontrolEt(String sifre) {
        boolean boslukKontrolSonuc=false;

        if (!sifre.contains(" ")){
            boslukKontrolSonuc=true;
        }else{
            System.out.println("Sifre bosluk icermemeli");
            boslukKontrolSonuc=false;
        }


        return boslukKontrolSonuc;
    }

    private static boolean sonHarfKontrolEt(String sifre) {
        char sonHarf=sifre.charAt(sifre.length()-1);
        boolean sonHarfSonuc=false;

        if (sonHarf>='a'&&sonHarf<='z'){
            sonHarfSonuc=true;
        }else{
            System.out.println("Sifrenizin son harfi kucuk olmalı");
            sonHarfSonuc=false;
        }


        return sonHarfSonuc;
    }

    private static boolean ilkHarfKontrolEt(String sifre) {
        char ilkHarf=sifre.charAt(0);
        boolean ilkHarfSonuc=false;

        if (ilkHarf>='A' && ilkHarf<= 'Z'){
            ilkHarfSonuc=true;
        }else {
            System.out.println("Sifrenizin ilk harfi buyuk harf olmalı");
            ilkHarfSonuc=false;
        }


        return ilkHarfSonuc;
    }


}
