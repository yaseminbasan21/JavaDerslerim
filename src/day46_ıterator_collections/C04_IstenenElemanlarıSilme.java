package day46_ıterator_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C04_IstenenElemanlarıSilme {

    public static void main(String[] args) {

        /*
        Soru3) Bir listedeki istenen sayı aralıgında olmayan
        elementleri silen bir program yazınız
        (2. Liste olusturmadan, gecerli Liste uzerinde islem yapınız)
        Orn: [2,13,56,23,45,14,40] istenen aralık 20 ile 40 arası (sınırlar dahil)
        output: [23,40]

         */

        List<Integer> liste=new ArrayList<>();

        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);

        ListIterator itr= liste.listIterator();

        while (itr.hasNext()){
            Object sayı=itr.next();

            if ((Integer)sayı<20 || (Integer)sayı>40){ //itr.next() methodunu her kullandıgımızda bir saga gider o yuzden 1 kere kullanmaya calıssak daha iyi
                itr.remove();
            }

        }
        System.out.println(liste);//[23, 40]

    }

}
