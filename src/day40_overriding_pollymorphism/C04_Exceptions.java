package day40_overriding_pollymorphism;

public class C04_Exceptions {

    public static void main(String[] args) {

        //String olarak verilen bir sayıyı integer'a cevirip
        //2 katını ekranda yazdıralım


        String str="1234a";



        //str icinde sayı olmayan bir karakter olursa
        //NumberFormatException: For input string verir
        

        try {
            int sayı=Integer.parseInt(str);
            System.out.println("Girilen sayının 2 katı: " + 2*sayı);
        }catch (Exception e){
           // e.printStackTrace();
            System.out.println("Girdiginiz String sayı olmayan elementler iceriyor");
        }


    }





}
