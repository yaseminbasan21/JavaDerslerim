package day22_arrays;

import java.util.Arrays;

public class C02_Sort {

    public static void main(String[] args) {

        //Verilen bir array'de en kucuk ve en buyuk degerleri yazdırın

       int arr[]={3,5,6,1,9,45,25,4,9};

       //sort methodu olmadan yapalım

        int enKucukSayı=Integer.MAX_VALUE; //En buyuk degeri atarız cunku kucuk bi deger atarsak elemanlardan kucuk olursa en kucuk sayıya ulasamayız
        int enBuyukSayı=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<enKucukSayı){
                enKucukSayı=arr[i];
            }

            if (arr[i]>enBuyukSayı){
                enBuyukSayı=arr[i];
            }
        }
        System.out.println("Array'deki en kucuk sayı: "+enKucukSayı);
        System.out.println("Array'deki en buyuk sayı: "+ enBuyukSayı);

        Arrays.sort(arr);
        System.out.println("Array'deki en kucuk sayı: "+arr[0]);
        System.out.println("Array'deki en buyuk sayı: "+arr[arr.length-1]);










    }

}
