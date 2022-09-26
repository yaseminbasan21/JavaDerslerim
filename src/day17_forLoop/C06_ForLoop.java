package day17_forLoop;

public class C06_ForLoop {

    public static void main(String[] args) {


        //Verilen iki harf ve aralarındaki harfleri yazdıran
        // bir kod yazınız

        char ilkHarf='m';
        char sonHarf='t';

        for (char i = ilkHarf; i <=sonHarf; i++) {
            System.out.print(i+" ");
        }


        double baslangıc=10;
        double bitis=20;
        double artıs=0.2;
        //baslangıc ve bitis sayıları arasında artıs miktarı ile
        //olusacak tum sayıları yazdırın
        for (double i = baslangıc; i<=bitis ; artıs++) {
            System.out.print(i+" ");
        }

    }


}
