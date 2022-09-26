package day10_switch_StringManipulation;

public class C03_Concate {

    public static void main(String[] args) {


       //Concatenation yapmak icin iki ihtimalimiz var
       //İstersek daha once yaptıgımız gibi + operatorunu kullanabiliriz
       //veya String class'ından gelen concat methodu'nu kullanabiliriz

        String str1="Java";
        String str2="Candır";

        //Java Candır yazdıralım

        System.out.println(str1+" "+str2);

        String cumle=str1.concat(str2);
        System.out.println(cumle);//JavaCandır

        cumle=str1.concat(" ").concat(str2);
        System.out.println(cumle);

        //concat icine String degil de sayı veya boolean deger yazsak?
        //concat method'u icine String parametre ister
        //String dısında bir data turu yazdıgımızda onu String haline getirmelisiniz



        //cumle=str1.concat(5); kabul etmez
        //cumle=str1.concat(true);kabul etmez

        cumle=str1.concat(" "+true);
        System.out.println(cumle);
    }




}
