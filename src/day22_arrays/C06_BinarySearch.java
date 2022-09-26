package day22_arrays;

import java.util.Arrays;

public class C06_BinarySearch {

    public static void main(String[] args) {

        int arr[]={3,5,6,1,9,45,25,4,9,0};
        int istenenSayı=26;

        //Eger Java'dan hazır BinarySearch ile yapmak isterseniz
        //once sort method'u kullanıp, sonra BinarySearch yapmalıyız
        //binarySearch()  bize istenen sayının oldugu index'i verir


        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[0, 1, 3, 4, 5, 6, 9, 9, 25, 45]
        System.out.println(Arrays.binarySearch(arr,istenenSayı));//Bize istedigimiz elementin index'ini verir


        //eger olmayan bir elementi aratırsak
        //Java bulamadıgını gostermek icin - isaretini koyar
        //sonrada o sayı olsaydı sıralaması ne olacak ise o sırayı bize verir



    }

}
