package day07_ıfElseStatements;

import java.util.Scanner;

public class C03_TekCıftSayı {

    public static void main(String[] args) {

       //Soru 1)Kullanıcıdan bir tamsayı isteyin
       //ve sayının tek veya cift oldugunu yazdırın



        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayı giriniz");
        int sayı= scan.nextInt();

        if (sayı%2==0){
            System.out.println("Girilen sayı cift sayıdır");
        }

        if (sayı%2 !=0){
            System.out.println("Girilen sayı tek sayıdır");
        }


        if (sayı%2==0){
            System.out.println("Girdiginiz sayı cifttir");
        }else {
            System.out.println("girdiginiz sayı tektir");
        }






        }




}
