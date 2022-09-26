package day19_doWhileLoop;

public class C02_WhileLoop {

    public static void main(String[] args) {

        //Kullanıcıdan bir sayı alın ve
        //bu sayının rakamları toplamını yazdırın


        int input=72345;
        int rakam=0;
        int rakamlarToplamı=0;

        while (input>0){
            rakam=input%10;
            rakamlarToplamı+=rakam;
            input/=10;
        }
        System.out.println(rakamlarToplamı);














    }


}
