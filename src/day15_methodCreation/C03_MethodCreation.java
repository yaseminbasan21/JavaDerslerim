package day15_methodCreation;

import java.util.Scanner;

public class C03_MethodCreation {





    public static void main(String[] args) {

        //Kullanıcıdan bir kelime isteyin,Eger kelime 3 harften kısa ise
        //"kelime cok kısa" yazdırın
        //Eger kelime 3,4 veya 5 harfli ise harf sayısını ve kelimenin
        //tersten yazılısını yazdırın
        //Eger 5 harften uzunsa kelime cok uzun yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime=scan.next();
        int harfSayısı=kelime.length();

        if (harfSayısı<3){
            System.out.println("Kelime cok kısa");
        }else if (harfSayısı==3){
              ucHarfiTersineCevir(kelime);
        }else if (harfSayısı==4){
              dortHarfiTersineCevir(kelime);
        }else if (harfSayısı==5){
              besHarfiTersineCevir(kelime);
        }else {
            System.out.println("Kelime cok uzun");
        }



    }
         //1-method olusturmak icin method'un adını yazarız
         //2-method'a giderken goturmem gereken variable varsa,bunu method'a eklemeliyim

    private static void besHarfiTersineCevir(String kelime) {
        String tersKelime=kelime.substring(4)+
                kelime.substring(3,4)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("Girdiginiz kelimedeki harf sayısı : "+ kelime.length());
        System.out.println("Girdiginiz kelimenin tersten yazılısı: "+tersKelime);
    }

    private static void dortHarfiTersineCevir(String kelime) {
        String tersKelime=kelime.substring(3)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("Girdiginiz kelimedeki harf sayısı : "+ kelime.length());
        System.out.println("Girdiginiz kelimenin tersten yazılısı: "+tersKelime);
    }



    private static void ucHarfiTersineCevir(String kelime) {
       String tersKelime=kelime.substring(2)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("Girdiginiz kelimedeki harf sayısı : "+ kelime.length());
        System.out.println("Girdiginiz kelimenin tersten yazılısı: "+tersKelime);
    }


}
