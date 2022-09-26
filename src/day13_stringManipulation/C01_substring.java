package day13_stringManipulation;

public class C01_substring {

    public static void main(String[] args) {

    String str="Java ile IT cok guzel";

        System.out.println(str.substring(5)); //ile IT cok guzel
        //yukardaki String'i Mehmet hoca ile IT cok guzel

        System.out.println(str.replace("Java","Mehmet Hoca"));
        System.out.println("Mehmet Hoca"+ str.substring(5));



    }





}
