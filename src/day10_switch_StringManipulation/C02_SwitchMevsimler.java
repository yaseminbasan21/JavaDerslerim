package day10_switch_StringManipulation;

import java.util.Scanner;

public class C02_SwitchMevsimler {

    public static void main(String[] args) {

       //Kullanıcıdan kacıncı ay oldugunu alıp mevsimi yazdıran
       //bir switch olusturun

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kacıncı ay oldugunu giriniz");
        int ayNo= scan.nextInt();

        switch (ayNo){
            case 12:
            case 1:
            case 2:
                System.out.println("Kış");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("İlkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar");
                break;

            default:
                System.out.println("Lutfen gecerli bir ay numarası giriniz");


        }



    }


}
