package day03_scanner;

public class C01_Variables {

    public static void main(String[] args) {


        //1-Farklı 3 data turunde variable olusturun ve bunları yazdırın
        String okulIsmı="Yıldız kolejı";
        System.out.println(okulIsmı);//Yıldız Kolejı

        char ilkHarf;
        ilkHarf='K';
        System.out.println(ilkHarf);//K

        int sayı1=10, sayı2=20;
        System.out.println(sayı1+sayı2);//30


        //2-isim ve soysim ıcın iki variable olusturun ve bunları
        //isminiz:Mehmet
        //soyisminiz:Bulutluoz seklinde yazdırın


        String isim="Yasemin";
        String soyisim="Başan";
        System.out.println("isminiz:"+isim);
        System.out.println("soyisminiz:"+soyisim);

        //3-İki farklı tamsayı data turunde iki variable olusturun ve bunların toplamını yazdırın

        int sayı4=10;
        double sayı3=20;
        System.out.println(sayı3 + sayı4);

        //5-char data turunde bir variable olusturun ve yazdırın
          char ozelkarakter='?';
        System.out.println(ozelkarakter);//?

        //6-Bir tamsayı, bir de char degisken olusturun ve bunların toplamını yazdırın

        int sayı5=20;
        char harf='a';

        System.out.println(sayı5+harf);//117
        //char data turundeki degiskenler matematiksel islemlerde kullanılırsa
        //o char degerinin ASCII karsılıgı isleme alınır

        int sayı16='a';
        System.out.println(sayı16);//97










    }



}
