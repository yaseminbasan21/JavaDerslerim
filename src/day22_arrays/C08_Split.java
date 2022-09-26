package day22_arrays;

public class C08_Split {

    public static void main(String[] args) {

        //Verilen bir cumlede istenen harfin kac defa kullanıldıgını
        //yazdıran bir method olusturun

        String cumle="Nerede o 'hello world' yazdıramayan ogrenciler?";
        String harf="e";

        harfKacKereKullanılmıs(cumle,harf);







    }

    private static void harfKacKereKullanılmıs(String cumle, String harf) {
        int sayac=0;
        String karakterler[]=cumle.split("");

        for (int i = 0; i < karakterler.length ; i++) {
             if (karakterler[i].equals(harf)){
                 sayac++;
             }
        }
        System.out.println("Aradıgınız "+harf+" verilen cumlede "+sayac+" kere kullanılmıs");
    }


}
