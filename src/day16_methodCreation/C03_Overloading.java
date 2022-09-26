package day16_methodCreation;

public class C03_Overloading {

    public static void main(String[] args) {

        //Verilen iki sayıyı toplayıp yazdıran bir method olusturalım

        int sayı1=10;
        int sayı2=20;

        ikiSayıToplak(sayı1,sayı2);

        //İki double sayının toplamını yazdıran bir method olusturalım

        double sayı3=15.2;
        double sayı4=10.3;
        ikiSayıToplak(sayı3,sayı4);

        //Eger variable olusturmadan direkt sayıları yazarak method call yaparsam
        ikiSayıToplak(15,25);//int toplamı verir
        ikiSayıToplak(10.1,12.3);//double toplam verir


        //Bir int ile bir double toplamını yazdıran bir method olusturalım
        int sayı5=3;
        double sayı6=3.2;

        ikiSayıToplak(sayı5,sayı6);

        //


    }
    private static void ikiSayıToplak(double sayı3, int sayı4) {
        System.out.println("Bir integer bir double toplamı: "+(sayı3+sayı4));
    }

    private static void ikiSayıToplak(int sayı3, double sayı4) {
        System.out.println("Bir integer bir double toplamı: "+(sayı3+sayı4));
    }

    private static void ikiSayıToplak(double sayı3, double sayı4) {
        System.out.println("İki double toplamı: "+(sayı3+sayı4));
    }

    private static void ikiSayıToplak(int sayı1, int sayı2) {

        System.out.println("İki integer toplamı: "+(sayı1+sayı2));
    }


}
