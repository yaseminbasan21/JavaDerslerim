package day46_ıterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C01_Iterator {
    public static void main(String[] args) {
        List<Integer> liste=new ArrayList<>();

        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);


        System.out.println(liste);//[5, 7, 8, 6, 9]


        Iterator itr= liste.iterator();//iterator methodu'nu olusturdugumuz liste objesi
                                       // uzerınden ArrayList class'ından calıstırıyoruz
         //(bu iterator sadece bu liste'de calısır)

        /*
        iterator nasıl calısır?
        bir iterator objesi olusturmak icin collection uyesi bir obje kullanmalıyız
        Iterator itr=liste.iterator();
        yani biz bu iterator objesini bizim ornegimizde Liste objesi uzerinde calısmak
        icin olusturmus olduk
        Biz iterator objesini olusturdugumuzda ,
        Iterator collection'ın ilk elementinin oncesine gidip bekler

         [(itr)5, 7, 8, 6, 9]
         itr.hasNext() ===>true  iterator'a yanında eleman var mı diye sorar, true veya false dondurur

         itr.next();  ===>iterator bir sonraki elementin yanına gecer,
                          ve uzerinden gectigi elementi bize dondurur
          [5, (itr)7, 8, 6, 9]  ===>bize 5 dondurur

          itr.next(); ===>

          [5, 7, (itr)8, 6, 9]  ===>bize 7 dondurur   .... bir daha next demedigimiz surece oldugu yerde kalır

          itr.remove();// iterator'ın elinde olan elementi sildii
          dolayısıyla ust uste iki kere itr.remove(); KULLANILAMAZ

          once itr.next(); methodunu calıstırıp
          iterator'ın elementi olmasını saglamalıyız

          */
        System.out.println( itr.hasNext());//true
        System.out.println(itr.next());//5
        System.out.println(itr.next());//7
        itr.remove();//
        System.out.println(liste);//[5, 8, 6, 9]
    }

}
