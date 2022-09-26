package day46_ıterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C02_ListeninElementleriniArtirma {

    public static void main(String[] args) {
        //verilen listedeki her elementi 3 arttırın

        List<Integer> liste=new ArrayList<>();

        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);


        System.out.println(liste);//[5, 7, 8, 6, 9]

        /*Listenin tum elementlerini bize getirmesi icin
          iterator'ın hasNext() ve next() methodlarını kullanacagız
         */

        ListIterator itr =liste.listIterator();

        while (itr.hasNext()){//yanında element oldugu muddetce calısacak

            Object sayı=itr.next();
            itr.set((Integer)sayı+3);

        }
        System.out.println(liste);//[8, 10, 11, 9, 12]



    }

}
