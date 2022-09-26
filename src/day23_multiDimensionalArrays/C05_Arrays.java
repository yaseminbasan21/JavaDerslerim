package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C05_Arrays {

    public static void main(String[] args) {

        //Verilen bir array'e yeni bir element ekleyen bir method olusturun

        int arr[]={3,5,7};

        //arr[3]=8; array'de olmayan bir index'e atama yapamayız, out of bounds

        //arr={1,3,5}; var olan bir array'e aynı boyutta bile olsa
        //direkt yeni degerler iceren bir array atayamayız

        arr=new int[4];
        System.out.println(Arrays.toString(arr));//[0, 0, 0, 0]

        int arrYeni[]=new int[5];
        arr=arrYeni;
        System.out.println(Arrays.toString(arr));//[0, 0, 0, 0, 0]

        arrYeni[0]=2;
        arrYeni[3]=5;

        arr=arrYeni;
        System.out.println(Arrays.toString(arr));//[2, 0, 0, 5, 0]

        //Bir array'e icinde hazır elementlerin oldugu bir array atamak isterseniz
        //bunu {1,2,3} seklinde yazarak degil
        //new int[3] diyerek olusturup sonra deger atayarak tamamladıgımız bir array'i
        //assign ederek yapabiliriz

        int arrEnyeni[]={1,2,3,4,5};
        arr=arrEnyeni;
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5]


    }

}
