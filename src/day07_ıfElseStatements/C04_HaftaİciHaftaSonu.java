package day07_ıfElseStatements;

import java.util.Locale;
import java.util.Scanner;

public class C04_HaftaİciHaftaSonu {

       public static void main(String[] args) {

       //Soru3)Kullanıcıdan gun ismini alın ve haftaici veya haftasonu oldugunu yazdırın
       //Or: gun=Pazar output="Haftasonu"
       //    gun=Salı output="Haftaici"
       //*** String icin equals method'unu kullanın

       //String case sensitive'dir
       //yani pazar,PAZAR,Pazar,PAzar bunlar hep farklı kelimelerdir

       //Bu durumda String methodlarından yardım alırız

           Scanner scan=new Scanner(System.in);
           System.out.println("Lutfen bir gun ismi giriniz");
           String gunIsmı=scan.next().toLowerCase();//Kullanıcı nasıl yazarsa yazsın kucuk harflere ceviriyoruz

           //String ifadelerde == kullanılması tavsiye edilmez
           //Cunku bekledigimizden farklı sonuc verebilir

           if (gunIsmı.equals("pazar") || gunIsmı.equals("cumartesi")){
               System.out.println("Girdiginiz gun haftasonu");
           }

           if (gunIsmı.equals("pazartesi")||gunIsmı.equals("salı")||gunIsmı.equals("carsamba") ||gunIsmı.equals("persembe")
                   ||gunIsmı.equals("cuma")){
               System.out.println("Girdiginiz gun haftaici");
           }

           }
    }