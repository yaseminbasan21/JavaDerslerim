package day23_multiDimensionalArrays;

import java.util.Scanner;

public class C07_MDArrays {

    public static void main(String[] args) {

        //Kullanıcıdan bir cumle isteyin ve cumledeki kelime sayısını yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle= scan.nextLine();

        String arr[]=cumle.split(" ");

        System.out.println("Girdiginiz cumledeki kelime sayısı: "+arr.length);





    }










}
