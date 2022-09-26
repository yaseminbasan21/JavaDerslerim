package day42_exceptions;

import java.util.Scanner;

public class C03_IllegalArgumentException {

    public static void main(String[] args) {

        /*
        Kullanıcıdan yasını isteyin
        kullanıcı yas olarak negatif bir sayı ,
        0 veya 120'den buyuk bir sayı girerse illegalArgumentException
        olusacak sekilde bir program yazınız

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasınızı giriniz");
        int yas= scan.nextInt();

        if (yas<=0 || yas>120){
           // System.out.println("Lutfen gecerli bir yas giriniz");
           //Java bizim istedigimiz durumlarda exception fırlatabilir
            throw new IllegalArgumentException();
        }else {
            System.out.println("Uygun yas girdiniz, tesekkurler");
        }






    }




}
