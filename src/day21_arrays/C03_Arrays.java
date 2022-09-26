package day21_arrays;

import java.util.Arrays;

public class C03_Arrays {

    public static void main(String[] args) {

    int arr[];//deger ataması yapmadık ama java kabul etti
              //ancak yazdırmamıza izin vermez,cunku boyutunu bilmez,deger ataması yapmamız gerekir
              //  System.out.println(Arrays.toString(arr));
    arr=new int[6];
    System.out.println(Arrays.toString(arr));//[0, 0, 0, 0, 0, 0]
    System.out.println(arr.length);//6
                                   //String'deki lenght(),bunda yok ...>()

        //array'deki her bir elemanı index degeri kadar arttiralım

        for (int i = 0; i < arr.length ; i++) {
            arr[i]+=i;
        }
        System.out.println(Arrays.toString(arr));//[0, 1, 2, 3, 4, 5]

        //son index'deki elementi yazdıralım
        System.out.println(arr[arr.length-1]);//5



    }

}
