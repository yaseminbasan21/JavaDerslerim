package day22_arrays;

import java.util.Arrays;

public class C05_BinarySearch {

    public static void main(String[] args) {

        //Verilen Array'de istenen bir elementin var olup olmadıgını
        //true / false yazdırarak gosteren bir method olusturun

        int arr[]={3,5,6,1,9,45,25,4,9,0};
        int istenenSayı=12;

        istenenElemanVarMı(arr,istenenSayı);

        //Eger Java'da hazır BinarySearch ile yapmak isterseniz
        //once sort methodunu kullanıp,sonra BinarySearch yapmalıyız



    }

    public static void istenenElemanVarMı(int[] arr, int istenenSayı) {
        boolean sonuc=false;
        for (int i = 0; i < arr.length ; i++) {

            if (arr[i]==istenenSayı){
                sonuc=true;
                break;
            }
        }
        System.out.println(sonuc);
    }


}
