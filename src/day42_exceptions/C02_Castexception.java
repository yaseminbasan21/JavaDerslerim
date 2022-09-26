package day42_exceptions;

public class C02_Castexception {

    public static void main(String[] args) {

        int sayı=10;

       // String str=sayı;//CTE Compile Time Error


        Object str3="Java cok guzel";
        String str4=(String)str3;
        System.out.println(str4);







        Object sayı2=20;

        String str2=(String)sayı2; //Explicit Norrowing
                                   //ClassCastException


    }





}
