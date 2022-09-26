package day15_methodCreation;

import java.util.Scanner;

public class C02_MethodCreation {

    public static void main(String[] args) {

        //Kullanıcıdan bir kelime isteyin,Eger kelime 3 harften kısa ise
        //"kelime cok kısa" yazdırın
        //Eger kelime 3,4 veya 5 harfli ise harf sayısını ve kelimenin
        //tersten yazılısını yazdırın
        //Eger 5 harften uzunsa kelime cok uzun yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime=scan.next();
        String tersKelime="";

        if (kelime.length()<3){
            System.out.println("kelime cok kısa");
        }else if (kelime.length()<=5){
            if (kelime.length()==3){
               tersKelime=kelime.substring(2)+
                          kelime.substring(1,2)+
                          kelime.substring(0,1);
            }else if (kelime.length()==4){
                tersKelime=kelime.substring(3)+
                           kelime.substring(2,3)+
                           kelime.substring(1,2)+
                           kelime.substring(0,1);
            }else{
                tersKelime=kelime.substring(4)+
                           kelime.substring(3,4)+
                           kelime.substring(2,3)+
                           kelime.substring(1,2)+
                           kelime.substring(0,1);

            }
            System.out.println("Girdiginiz kelimedeki harf sayısı : "+ kelime.length());
            System.out.println("Girdiginiz kelimenin tersten yazılısı: "+tersKelime);

            }else if (kelime.length()>5){
            System.out.println("Kelime cok uzun");
        }

    }



}
