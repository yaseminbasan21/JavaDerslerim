package day49_maps;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C02_ListeyiDuzenliYazdırma {
    public static void main(String[] args) {
     //MapOlustur.myMap(); MapOlustur class'ından myMap methodu oraya
     //gidecek,Map'ı olusturucak,bana döndürücek
     //kapıcıya bana bi Map al gel dedim
     //Map'i bana getirdi ama napmam lazım,ondan alıp eve koymam lazım
     //bu class'a koymam lazım
     //Bunu nasıl yapıcam>>>>karsısına bir Map agı olusturup atama yapıcam

       // Map<Integer,String> sınıf=MapOlustur.myMap();
       //esitligin sag tarafı bana getiriyo,sol tarafta da bu class'da
       //kullanabilecegimiz sınıf Map'ine eklemis oluyoruz



        //Sınıf listesini duzenli bir sekilde yazdırmak
        Map<Integer,String> sınıf=MapOlustur.myMap();
        System.out.println(sınıf);//{101=Ali, Can, Dev, 102=Veli, Yan, QA, 103=Ali, Yan, C#}
        sınıfListYazdır(sınıf); //Sınıf listesini yazdırmak istedigim icin
                                //sınıfListYazdır method'u olusturdum, sınıf Map'ini verdim
                                //olay hep method'lar uzerinden giderse kafamız rahatlar

    }

    public static void sınıfListYazdır(Map<Integer, String> sınıf) {

        System.out.println("Numara    Isım    Soyisim     Brans");
        System.out.println("====================================");

        //sınıf.keySet(); bunu yaparsam 101'i ayrı 102'yi ayrı 103'u ayrı yazdırmaz
        //hepsini birden yazdırayım der ama biz bunu istemiyoruz ki
        //bunları birer birer yazdırsın istiyoruz o yuzden
        //bunu once bir Set'e atmamız lazım

        //sonra bitane daha set olusturalım buna da sınıf value'yu atayalım



        //Map yapısında yazdırdıgımızda kullanıcılar bir sey anlamayabilir
        //bunun icin map yapısını kodlarla manipule edip
        //map'deki dataları, istedigimiz formata sokmamız gerekir
        //1.adım key ve value'ları map'den alıp
        //iki farklı collection uyesine atadık
        Set<Integer> keySet=sınıf.keySet();
        Collection<String>valueSet=sınıf.values();

        System.out.println(keySet);//[101, 102, 103]
        System.out.println(valueSet);//[Ali, Can, Dev, Veli, Yan, QA, Ali, Yan, C#]
        System.out.println(valueSet.size());//3

        for (String each:valueSet  //String'ler gelicek valueSet'den
             ) {
            System.out.println(each);
        }
        /*
        Ali, Can, Dev
        Veli, Yan, QA
        Ali, Yan, C#

         */



    }


}
