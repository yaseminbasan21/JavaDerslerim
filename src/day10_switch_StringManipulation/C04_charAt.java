package day10_switch_StringManipulation;

public class C04_charAt {

    public static void main(String[] args) {

         //String herhangi bir karakteri almak istedigimizde
        //o harfin index'ini kullanarak
        // str.charAt(istenenIndex) yazabiliriz

        String str="Java Cok Guzel";
        //J yi yazdıralım
        System.out.println(str.charAt(0));

        //G'yi yazdıralım
        System.out.println(str.charAt(9));

        //va yazdıralım
        System.out.println(""+str.charAt(2)+str.charAt(3));//va

        //cOK yazdıralım
        System.out.println(""+str.toLowerCase().charAt(5)+str.toUpperCase().charAt(6)+str.toUpperCase().charAt(7));

        //son karakteri yazdırın
        //String'de 14 harf var,son harfin ındex'i 14-1
        System.out.println(str.charAt(14-1));//uzunluk-1

        //eger uzunlugu index olarak girersek
        //Java calıstıktan sonra hata verir
       // System.out.println(str.charAt(14));


    }







}
