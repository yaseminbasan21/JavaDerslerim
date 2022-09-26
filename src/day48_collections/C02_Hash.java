package day48_collections;

import java.util.HashSet;
import java.util.Set;

public class C02_Hash {
    public static void main(String[] args) {

        String str="Java cok guzel";

        System.out.println(str.hashCode());//-481588044

        String str2="Hava cok guzel";
        System.out.println(str2.hashCode());//529529206

        Set<Integer>sayıKumesi=new HashSet<>();
        System.out.println(sayıKumesi.hashCode());//0

        sayıKumesi.add(10);
        System.out.println(sayıKumesi.hashCode());//10

        sayıKumesi.add(20);
        System.out.println(sayıKumesi.hashCode());//30

        //Java tum obje'ler icin bi hasCode uretiyor
        //ve o hasCode'a gore elementleri bulmada kolaylık saglıyor
        //hascode o obje'nin Java'daki hasCode'u ne bize soyler
        //(kendim yazdım)


    }

}
