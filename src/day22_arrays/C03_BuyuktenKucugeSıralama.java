package day22_arrays;

import java.util.Arrays;

public class C03_BuyuktenKucugeSıralama {

    public static void main(String[] args) {

        //Verilen bir array'i buyukten kucuge sıralayıp yazdıran bir
        //method olusturun

        int arr[]={3,5,6,1,9,45,25,4,9,0};
        terstenSıralaYazdır(arr);

        //en buyuk sayıyı yazdır
        System.out.println(arr[0]);//0 kaydetmedigimiz icin boyle oldu
                                   //kalıcı olarak kaydetmek istersek dondurmemiz lazım



    }

    public static void terstenSıralaYazdır(int[] arr) { //void kaldı cunku sadece yazdırıcaz
        Arrays.sort(arr);//[0, 1, 3, 4, 5, 6, 9, 9, 25, 45]
        int tersArr[]=new int[arr.length];//[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        for (int i = 0; i < arr.length ; i++) {
            tersArr[i]=arr[arr.length-1-i]; //i 0 , son index'ten 0 cıkar
                                            //i 1 , son index'ten 1 cıkar
                                            //i 2 , son index'ten 2 cıkar
        }
        System.out.println(Arrays.toString(tersArr));//[45, 25, 9, 9, 6, 5, 4, 3, 1, 0]

    }


}
