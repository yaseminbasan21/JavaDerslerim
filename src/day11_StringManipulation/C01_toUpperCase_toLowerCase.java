package day11_stringManipulation;

import java.util.Locale;

public class C01_toUpperCase_toLowerCase {

       public static void main(String[] args) {

        String str="Java Guzeldır";

        //String method'larını arka arkaya kullanabiliriz
        //mesela ikinci kelimenin ilk harfini kucuk olarak yazdıralım

       // str.charAt(5); boyle yazdıgımızda sonuc artık String degıl char olacaktır
       //dolayısıyla String'de yapmak istedigimiz tum degisiklikleri
       //once yapıp sonra charAt()methodu'nu kullanmalıyız

           System.out.println(str.toLowerCase().charAt(5));//g

           System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));//JAVA GUZELDİR

           System.out.println(str.toUpperCase(Locale.forLanguageTag("fr")));//JAVA GUZELDIR












    }





}
