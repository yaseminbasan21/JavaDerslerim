package day11_StringManipulation;

import java.util.Scanner;

public class C03_equalsIgnoreCase {

    public static void main(String[] args) {

    //Kullanıcıya derse katılıp katılmak istemedigini sorun
    //evet derse cevabını ve "derse katılımınız alınmıstır yazdırın
    //hayır derse cevabını ve "Sonraki derslerimize bekleriz" yazdırın


        Scanner scan=new Scanner(System.in);
        System.out.println("Derse katılmak ister misiniz? \n Evet veya hayır yazınız");
        String cevap=scan.next();

        if (cevap.equalsIgnoreCase("evet")){
            System.out.println("Cevabınız: "+cevap+" derse katılmanız onaylanmıstır");
        }else if (cevap.equalsIgnoreCase("hayır")){
            System.out.println("cevabınız : " + cevap+" Sonraki derslerimize bekleriz");
        }else {
            System.out.println("Lutfen evet veya hayır yazınız");
        }



    }


}
