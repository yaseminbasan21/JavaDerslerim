package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C01_MultiDimensionalArrays {

    public static void main(String[] args) {


        int arr[][]={{3,1,7},{6,10,2}};

        System.out.println(arr[0][2]);//7
        System.out.println(arr[1][1]);//10
        System.out.println(arr[0][0]);//3

        //ilk inner array'in tum elementlerini yazdırın
       // System.out.println(arr[0]);//arr[0] bir array oldugundan direkt yazılmaz ,[I@57829d67
        System.out.println(Arrays.toString(arr[0]));//[3, 1, 7]

        System.out.println(Arrays.toString(arr));//[[I@57829d67, [I@19dfb72a]

        //MDArray'de tum elementleri bir array olarak yazdırmak istersek
        System.out.println(Arrays.deepToString(arr));//[[3, 1, 7], [6, 10, 2]]



    }







}
