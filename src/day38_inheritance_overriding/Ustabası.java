package day38_inheritance_overriding;

import java.util.ArrayList;
import java.util.List;

public class Ustabası extends Iscı {

    public String statu="Ustabası";
    public String haklar="Ustabası haftada bırgun exstra tatil hakkına sahiptir";

    public void mesai(){
        System.out.println("Arıza varsa Ustabası exstra ucret almadan calısır");
    }

    public void maasHesapla(){

        System.out.println("Ustabası 30 gun * 8 saat * 12 euro = " +(30*8*12)+ "Euro maas alır" );
    }

    public static void main(String[] args) {

        /*
          İcinde oldugumuz Class'dan klasik haliyle bir obje olusturursak
          o obje ile cagırdıgımız variable ve method'larda
          Java once icinde bulundugumuz class'a bakar
          aradıgımız class uyesi,icinde oldugumuz class'da varsa
          bize onu getirir
          YOKSA,
          parent class(lar)a bakar, ilk buldugunu getirir

        */

        Ustabası yasin=new Ustabası();
        System.out.println(yasin.statu);//Ustabası
        System.out.println(yasin.haklar);//Ustabası haftada bırgun exstra tatil hakkına sahiptir
        System.out.println(yasin.ikramiye);//Isciler yılda bir ikramiye alır
        System.out.println(yasin.izin);//Tum personel yılda 4 hafta izin kullanabilir
        yasin.maasHesapla();//Ustabası 30 gun * 8 saat * 12 euro = 2880Euro maas alır
        yasin.mesai();//Arıza varsa Ustabası exstra ucret almadan calısır

        /*
           Eger isci olarak ozelliklerini gormek istersek
           Class adını (Data turu) Iscı seceriz
         */

        Iscı ahmet=new Ustabası();
        System.out.println(ahmet.statu);//Isci
        System.out.println(ahmet.haklar);//Isciler kıdem tazminatı alırlar
        System.out.println(ahmet.ikramiye);//Isciler yılda bir ikramiye alır
        System.out.println(ahmet.izin);//Tum personel yılda 4 hafta izin kullanabilir
        ahmet.maasHesapla();//Ustabası 30 gun * 8 saat * 12 euro = 2880Euro maas alır
        ahmet.mesai();//Arıza varsa Ustabası exstra ucret almadan calısır


        /*
        Siz bir obje'yi hangi class'dan tanımlarsamız o class'a ait ozelliklere sahip olur
         */
        Personel adem=new Ustabası();
        System.out.println(adem.statu);//Personel
        System.out.println(adem.haklar);//Tum personel esit haklara sahiptir
        //System.out.println(adem.ikramiye);//CTE verir,ikramiye variable'ı isci class'ında cunku
        System.out.println(adem.izin);//Tum personel yılda 4 hafta izin kullanabilir
        adem.maasHesapla();//Ustabası 30 gun * 8 saat * 12 euro = 2880Euro maas alır
        adem.mesai();//Arıza varsa Ustabası exstra ucret almadan calısır

        /*
        Personel adem=new Ustabası(); Bu bir Ustabası objesi'dir.
        Personel adem=new Personel(); Bu bir Personel objesi'dir.
         */


        /*
        Personel adem=new Ustabası();

        adem'in data turu Personel'dir.
        Boylece biz adem'i ne olarak isimlendirdigimizi bilebiliriz
        Ancak ben adem'in Ustabası oldugunu biliyorum
        cunku constructor'ı Ustabası
        Ama bu yazım formatı ile adem'in tum Personel ile birlikte sahip oldugu
        ortak ozellikleri vurgulamak istiyorum

        Bu kullanım seklinde olusturulan obje data turu olarak secilen class
        ve onun parent class'larındaki variable'ları kullanabilir
         */

        List<String>list=new ArrayList<>();//Aslında bir ArrayList olusturduk,ama onun list ozelliklerini kullandık

    }






}
