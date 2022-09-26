package day02_variables;

public class C03_Variables {

    public static void main(String[] args) {

        String ogrenciIsmı="Melih";

        ogrenciIsmı="Furkan";
       // System.out.println(ogrenciIsmı);//Furkan

       //Bir variable declare edildikten sonra istedigimiz kadar deger degisimi yapabiliriz
       //Ancak declare edilen bir variable tekrar declare edilemez
       //String ogrenciIsmı="Abdullah";

        String isim,soyisim,dogumYeri;
        isim="Nıhad";
        soyisim="ozel";
        dogumYeri="Ankara";

        System.out.println(dogumYeri);
        System.out.println(soyisim);

        String tcNo="123456";
        String hıclık="";

        //String non primitive oldugu ıcın biz sadece data saklamak degıl
        //ekstra bazı ozellikleri de kullanabiliyoruz
        //Eger Tc No, okul numarası veya tel numarası gibi
        //kendisi sayısal olan ancak matematiksel bir islemde kullanılmayan
        //degerler icin de String kullanılabilir


        String harf="A";
        char harf2='A';

        //bu ikisi icin de aynı durum gecerli
        //ben A harfi icin bir variable'ı char olarak da olusturabilirim
        //Eger sadece saklayacaksak char kullanılabilir ama
        //String'in ozelliklerinden istifade etmek icin String olarak tanımlamak daha avantajlı olabilir





    }








}
