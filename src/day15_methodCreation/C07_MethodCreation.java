package day15_methodCreation;

public class C07_MethodCreation {

    public static void main(String[] args) {



         //String'i yazdıran method oluşturalım
        //hosgeldiniz diyen bir method olusturalım
        //kapanma mesajı yazan bir method olusturalım

        hosgeldinizYazdır();

        kapanmaMethodu();

       //(method'lar icerisinde gezmek icin,bir method'un icerisindeyken digerini cagırmak yeterli(ben yazdım)
    }

    public static void kapanmaMethodu() {
        System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz");

    }

    public static void hosgeldinizYazdır() {
        System.out.println("Hosgeldiniz");
        stringYazdır("Boyle de olur");
    }


    public static void stringYazdır(String str) {
        System.out.println(str);
        kapanmaMethodu();
    }


}
