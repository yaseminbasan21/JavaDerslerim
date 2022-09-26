package day49_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_Maps {
    public static void main(String[] args) {

         //Java'da collection uyesi bir yapıda
         //data turu OBJECT secilirse, her data turunden deger ekleyebilriz
         //ancak bu durumda surekli casting problemleri ile karsılasabiliriz (21. satırda Integer yapmamız gibi)

         List<Object> list=new ArrayList<>();
         list.add("Ergin");
         list.add(15);
         list.add(10.2);

        System.out.println(list);//[Ergin, 15, 10.2]

        list.set(1,(Integer)(list.get(1)) + 10);


        Map<Integer,String>sınıfList=new HashMap<>();
        //Bir sınıfta ogrenci no ve isim, soyisim, brans olarak map  olusturmak istiyoruz
        //key tek bir unique degerdir
        //ama value/deger birden fazla bilginin birlesiminden olusabilir
        //bu durumda daha sonra istedigimiz bilgilere dogru sekilde ulasabilmek icin
        //tum elementler icin value aynı bicimde olusturulmalıdır
        //(veri sıralaması ve sekilsel acıdan or/bosluk falan da)
        sınıfList.put(101,"Ali, Can, Dev");
        sınıfList.put(102,"Veli, Yan, QA");
        sınıfList.put(103,"Ali, Yan, C#");

        System.out.println(sınıfList);              //(ben yazıyorum,, burdaki = Java'nın ayırması)
        //{101=Ali, Can, Dev, 102=Veli, Yan, QA, 103=Ali, Yan, Dev}

        System.out.println(sınıfList.keySet());//[101, 102, 103]

        System.out.println(sınıfList.values());
        //[Ali, Can, Dev, Veli, Yan, QA, Ali, Yan, C#]

        //System.out.println(sınıfList.containsValue("Yan"));
        //Boyle direkt bulamayız, illaki ugrasmamız lazım


    }
}
