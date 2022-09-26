package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C06_Arrays {

    public static void main(String[] args) {

        //Verilen bir array'e yeni bir element ekleyen bir method olusturun

        int arr[]={3,5,7,8};
        int eklenecekElement=11;

        arr=arrayeElemanEkle(arr,eklenecekElement);

        System.out.println(Arrays.toString(arr));//[3, 5, 7, 8, 11]

        arr=arrayeElemanEkle(arr,9);
        System.out.println(Arrays.toString(arr));//[3, 5, 7, 8, 11, 9]




    }

    public static int[] arrayeElemanEkle(int[] arr, int eklenecekElement) {

        int yeniArray[]=new int[arr.length+1];//[0, 0, 0, 0]

        for (int i = 0; i < arr.length; i++) {
            yeniArray[i]=arr[i];
        }
           yeniArray[yeniArray.length-1]=eklenecekElement;
        return yeniArray;
    }

}
