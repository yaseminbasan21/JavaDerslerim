package day09_ternary_Switch;

import java.util.Scanner;

public class C02_Ternary {

    public static void main(String[] args) {

        //Ternary ile yapılan tum islemler if else ile de yapılabilir
        //if else yerine ternary tercih etmenin sebebi yapının basit ve anlasılır olmasıdır
        //Ternary icerisinde komplexs kodlar olmaz
        //sadece sonuc ve bizi sonuca goturen basit islemler olabilir


        //Kullanıcıdan bir tam sayı alıp tek mi cift mi yazdıran bir kod yazalım

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayı giriniz");
        int sayı= scan.nextInt();

        if (sayı%2==0){
            System.out.println("sayı cift");
        }else {
            System.out.println("sayı tek");
        }

        System.out.println(sayı%2==0 ? "sayı cift" : "sayı tek");





        }
    }