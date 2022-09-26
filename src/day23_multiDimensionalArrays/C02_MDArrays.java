package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C02_MDArrays {

    public static void main(String[] args) {

        //Verilen multidimensional array'in tum elementlerinin toplamını bulunuz
        int arr[][]={{3,1,7,5},{6,10}};

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                toplam+=arr[i][j];
            }
        }
        System.out.println("Array'deki elementlerin toplamı : "+toplam);







    }



}
