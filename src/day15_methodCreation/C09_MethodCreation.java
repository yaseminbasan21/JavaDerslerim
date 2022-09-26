package day15_methodCreation;

import java.util.Locale;

public class C09_MethodCreation {

    public static void main(String[] args) {

      String isim="yasemin yalcin";
      String soyisim="sarı";
      String kKno="1234567890128795";

      //eger bir method'dan bir islem yapmasını
      //ve yaptıgı islemi bize getirmesini isterseniz
      //return type void degil, bize getirecegi sonucun data turunde olmalıdır
      String gizlenmisIsımSoyisim=isimSoyisimGizle(isim,soyisim);
        System.out.println(gizlenmisIsımSoyisim);
      //bana isim ve soyismin gizlenmis halini getirmesini istiyorum
      //bekledigim donus String olur
      String gizlenmisKrediKartıNO= krediKartıGizle(kKno);
        System.out.println(gizlenmisKrediKartıNO);




    }

    private static String krediKartıGizle(String kKno) {
        String yeniKKno="**** **** **** "+kKno.substring(12);
        return yeniKKno;

    }

    private static String isimSoyisimGizle(String isim, String soyisim) {
        String yeniIsım =isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\S","*");

        String yeniSoyIsım =isim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\S","*");

        return yeniIsım+" "+yeniSoyIsım;

    }
      }