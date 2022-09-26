package day25_lists;

public class C02_Array {

    public static void main(String[] args) {

        //Verilen bir array'den istenen elementi silip,
        //kalanları yeni bir array olarak yazdıran bir method olusturun

        int arr[]={3,4,2,3,5,7,3,8,5,2,4};

        int istenmeyenEleman=3;

        istenmeyenElementiSil(arr,istenmeyenEleman);




    }

    public static void istenmeyenElementiSil(int[] arr, int istenmeyenEleman) {
        //1-istenmeyen element sayısını bulalım
        int sayac=0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==istenmeyenEleman){
                sayac++;
            }
        }
        //2-yeni array'i olusturalım

    }


}
