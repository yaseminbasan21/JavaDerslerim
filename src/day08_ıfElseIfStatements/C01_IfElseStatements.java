package day08_ıfElseIfStatements;

import java.util.Scanner;

public class C01_IfElseStatements {

    public static void main(String[] args) {

        //Girilen bir karakterin harf olup olmadıgını bulalım

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char karakter=scan.next().charAt(0);

        if ((karakter>='A' && karakter<='Z') || (karakter>='a' && karakter<='z')){

            System.out.println("Gırdıgınız karakter bir harf");

        } else {
            System.out.println("");
        }
    }



}