package day12_stringManipulation;

public class C01_indexOf {

    public static void main(String[] args) {

    //Kullanıcıdan bir cumle ve bir kelime isteyin,kelimenin cumledeki kullanımına bakarak
    //  -Girilen kelime cumlede kullanılmamıs
    //  -Girilen kelime cumlede 1 kere kullanılmıs
    //  -Girilen kelime cumlede 1'den fazla kullanılmıs

        String cumle="Java ogren,yeni program ile yeni bir sayfa ac";
        String kelime="yeni";

        int ilkKullanım=cumle.indexOf(kelime);
        int ikinciKullanım=cumle.indexOf(kelime,ilkKullanım+1);






    }





}
