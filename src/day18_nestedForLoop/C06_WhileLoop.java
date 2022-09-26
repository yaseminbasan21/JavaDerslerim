package day18_nestedForLoop;

public class C06_WhileLoop {

    public static void main(String[] args) {

        //Kullanıcıdan iki tamsayı alıp bu sayıları ve aralarındaki tum tamsayıları yazdıran bir kod olusturun

        int baslangıc=40;
        int bitis=60;



        for (int i = baslangıc; i <=bitis ; i++) {
            System.out.print(i + " ");
        }
        System.out.print(" ");


       //aynı soruyu while loop ile yapalım
        int i=baslangıc;
        while (i<=baslangıc){
            System.out.print(baslangıc+ " ");
            baslangıc++;
        }
        System.out.println(" ");
        System.out.println(baslangıc);
    }






}
