package day23_multiDimensionalArrays;

public class C03_MDArrays {

    public static void main(String[] args) {

    //Boyutları belirli bir array'i elementleri girmeden olusturalım

    //Bir okulda icinde 24 ogrenci olan 8 sınıf vardır

    int arr[][]=new int[8][24];

    //Bir ilcede her birinde 24 ogrencilik 8 sınıf bulunan 5 okul vardır
     int ilce[][][]=new int[5][8][24];

     //Bir okulda 3 tane 24 kişilik, 2 tane de 22 kişilik sınıf vardır
        int sınıf24[][]=new int[3][24];
        int sınıf22[][]=new int[2][22];

      //olustururken elementleri atama yaparsak farklı uzunlukta inner array'ler tanımlayabilir
        int arr1[][]={{3,1,7,5},{6,10}};


    }





}
