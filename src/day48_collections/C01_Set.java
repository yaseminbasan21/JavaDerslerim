package day48_collections;

import java.util.HashSet;
import java.util.Set;

public class C01_Set {

    public static void main(String[] args) {
        //Verilen bir array'in tekrar eden elementlerini
        // sadece bir kere yazdıran bir method olusturun

        Integer arr[]={3,5,4,6,3,1,2,7,8,6,1,4,2,8};
        arrayiTekrarsızYazdır(arr);
    }

    private static void arrayiTekrarsızYazdır(Integer[] arr) {
        Set<Integer> tekrarsızElementKumesi=new HashSet<>();

        for (Integer each:arr
             ) {
            tekrarsızElementKumesi.add(each);
        }

        System.out.println(tekrarsızElementKumesi);//[1, 2, 3, 4, 5, 6, 7, 8]



    }


}
