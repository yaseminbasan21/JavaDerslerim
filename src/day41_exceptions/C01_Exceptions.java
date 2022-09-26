package day41_exceptions;

public class C01_Exceptions {
    public static void main(String[] args) {

        int a=10;
        int b=0;
        int c=0;
        try {
            c=a/b;         //Ben bir exception'la karsılastım
        } catch (Exception e) {  //bu exception'ı e objesine koydum ve yoluma devam ediyorum
            //Burada yazdıgımız e : Java'nın exception'ı atayacagı obje
            //Exception ise olusan exception'nın turu
            //  e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }

        System.out.println(c);

    }




}
