package day40_overriding_pollymorphism;

import java.util.Scanner;

public class C03_Exceptions {

    public static void main(String[] args) {

        //Kullanıcıdan iki sayı alıp, bolerek sonucu yazdıran bir program yazınız

        Scanner scan=new Scanner(System.in);
        int kontrol=0;
        while (kontrol !=2){
            System.out.println("Bolmek istediginiz sayıyı yazınız");
            int sayı1= scan.nextInt();

            System.out.println("Kaca bolmek istediginizi yazınız");
            int sayı2=scan.nextInt();


            try {
                System.out.println("sonuc= " + sayı1/sayı2);
            } catch (Exception e) {
               // e.printStackTrace();
                System.out.println("Girdiginiz sayılarda sorun var");
            }

            System.out.println("Devam etmek icin 1 \nbitirmek icin 2'ye basın");
            kontrol= scan.nextInt();
        }


        /*
        Sayı2 0 oldugunda sayı1/0 tanımsız olacagından
        Java bu durumla karsılasınca exception ne tur bir sorun oldugu
        neyden kaynaklandıgı ve hangi satırda olustugu yazar
        Exception in thread "main" java.lang.ArithmeticException: / by zero
	at day40_overriding_pollymorphism.C03_Exceptions.main(C03_Exceptions.java:19)

         bunu cozmek icin sayı2'yi if ile kontrol edebiliriz



         if (sayı2==0){
             System.out.println("Sayı/0 tanımsızdır");
         }else{
             System.out.println("sonuc = " + sayı1/sayı2);
         }

         Ama bu yontem her sorunda calısmaz

        System.out.println("sonuc= " + sayı1/sayı2); */




    }

}
