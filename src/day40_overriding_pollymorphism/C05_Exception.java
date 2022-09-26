package day40_overriding_pollymorphism;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C05_Exception {
    public static void main(String[] args) {

        //Kullanıcıdan istedigi kadar sayıyı alıp toplayan bir program yazınız
        //Toplam 500'u gecerse programı bitirsin veya
        //Kullanıcı bitirmek istediginde Q'ya bassın

        Scanner scan = new Scanner(System.in);
        int toplam = 0;

        do {
            System.out.println("Lutfen toplamak istediginiz sayıyı giriniz \nBitirmek icin Q'ya basınız");
            int sayı= 0;


            try {
                sayı = scan.nextInt();
                toplam+=sayı;
            } catch (InputMismatchException e ) {
                String hatalıGırıs= scan.next();
                if (hatalıGırıs.equalsIgnoreCase("q")){
                    break;
                }else {
                    System.out.println("Hatalı giris");
                }

            }


        }while (toplam<500);
        System.out.println("Girdiginiz sayıların toplamı: "+ toplam);



    }
}
