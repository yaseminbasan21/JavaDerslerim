package day03_scanner;

public class C02_SwapVariables {

    public static void main(String[] args) {

        /*
        1- Verilen sayi1 ve sayi2 değişken'lerinin değerlerindeki değişim (SWAP)
        bir program yaziniz
	     Orn : sayi1=10 ve sayi2=20;
		  kod calisistiktan sonra
		 sayi1=20 ve sayi2=10

         */


        int sayi1=10;
        int sayı2=20;

        System.out.println("Swap'dan once sayi1: " + sayi1 + "sayi2 : "+ sayı2);


        // 1.adım bos bir değişken olusturup
        // sayi1'i ona atayalim

        int temp=sayi1;

        // 2.adim sayi1'e yeni değerin atayalim

        sayi1= sayı2;

        // 3. adım sayi2'ye temp'e yedekledigimiz sayi1 değerini atayalim

        sayı2= temp;

        System.out.println("Swap'dan sonra sayi1: " + sayi1 + ", sayı2 : "+ sayı2);





    }




}
