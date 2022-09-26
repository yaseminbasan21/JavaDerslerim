package day10_switch_StringManipulation;

import java.util.Scanner;

public class C01_SwitchCase {

    public static void main(String[] args) {

        //Kullanıcıdan sayı olarak ay numarasını alıp
        //istenen ay ismini yazdıran bir program yazdırın


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kacıncı ay oldugunu giriniz");
        int ayNo=scan.nextInt();

        //bu soruyu if else ile yapabiliriz ama art arda 12 kere if else cok
        //kalabalık ve anlasılması guc olabilir
        //Bunun yerine switch-case yapısını kullanabiliriz

        switch (ayNo){

            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Subat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayıs");
                break;
            case 6:
                System.out.println("Haziran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Agustos");
                break;
            case 9:
                System.out.println("Eylul");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Kasım");
                break;
            case 12:
                System.out.println("Aralık");
                break;
            default:
                System.out.println("Lutfen gecerli bir ay numarası giriniz");
        }
            //switch icine yazılan variable'ın degerine gore
            //ilgili case'i bulur ve break gorene kadar kodu calıstırır
            //eger break yoksa ilgili case'den asagı dogru tum case'ler calısır
            //if-else'deki son else gibi, geriye kalan durumları tamamen
            //kapsayacak bir satır daha ekleyebiliriz





        }





}
