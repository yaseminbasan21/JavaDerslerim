package day21_arrays;

public class C01_Arrays {


    public static void main(String[] args) {

    //array'i nasıl deklare ederiz
    //data turu,array'in ismi ve koseli parantez yazarak array deklare edilir

    int arr1[]={1,3,5};
    int[] arr2={2,3,5};
    int [] arr3={1,4,5};

    double arr4[]={10.2,20.1,5};

    String arr5[]={"Ali","Veli","Ayse"};

    //assign mecburi midir?
    int sayı;

    int arr6[];
    //Kullanmadan once mutlaka deger ataması yapmamız gerekir

    //hem deklare edip hem de atama yapıcaksam nasıl yapabilirim?
    //1-deklare edip esitligin sagına suslu parantez icerisinde degerleri yazabilirim
        String arr7[]={"Ali","Veli","Ayse"};
    //2-icine deger atamadan olusturmak isterseniz, boyutunu belirlememiz gerekir
        int arr8[]=new int[5];//java icinde 5 tane default deger olan bir array olusturur
                              //[0,0,0,0,0]

        System.out.println(arr8[2]);//0

    }








}
