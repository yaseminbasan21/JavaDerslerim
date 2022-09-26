package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C01_Contains {

    public static void main(String[] args) {

        List<String> harfler=new ArrayList<>();
        harfler.add("D");//[D]
        harfler.add("M");//[M)
        harfler.add(1,"T");
        harfler.add(0,"T");//[T, D, T, M]
        System.out.println(harfler);

        List<String> karakterler=new ArrayList<>();
        karakterler.add("M");
        karakterler.add("T");
        System.out.println(harfler.containsAll(karakterler));//true

        karakterler.add("F");




    }




}
