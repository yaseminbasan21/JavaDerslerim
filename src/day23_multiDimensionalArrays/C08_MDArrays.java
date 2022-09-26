package day23_multiDimensionalArrays;

public class C08_MDArrays {

    public static void main(String[] args) {

        //Soru2)Asagıdaki MDArray'in
        //ic array'lerindeki son elemanların carpımını
        //ekrana yazdıran bir program yazınız {{1,2,3},{4,5},{6}};

        int arr[][]={{1,2,3},{4,5},{6,2}};
        int carpım=1;

        for (int i = 0; i < arr.length; i++) {

            carpım*=arr[i][arr[i].length-1];

        }
        System.out.println("Son elementlerin carpımı: "+ carpım);



    }


}
