package day32_dateTime;

public class C06_Varargs {

    public static void main(String[] args) {


        //verilen iki sayıyı toplayan bir method olusturun

        int sayı1=10;
        int sayı2=20;
        int sayı3=30;
        int sayı4=40;
        int sayı5=50;

        //bir de 3 sayıyı toplayan bir method olusturalım

        toplaGel();

        toplaGel(sayı1);

        toplaGel(sayı1,sayı2);

        toplaGel(sayı1,sayı2,sayı3);

        toplaGel(sayı1,sayı2,sayı3,sayı4);



    }

    private static void toplaGel(int... sayı) {
      int toplam=0;
        for (int each: sayı) {
            toplam+=each;
        }
        System.out.println(toplam);
    }

    private static void toplaGel(int sayı1, int sayı2, int sayı3) {
        System.out.println(sayı1+sayı2+sayı3);
    }

    private static void toplaGel(int sayı1, int sayı2) {
        System.out.println(sayı1+sayı2);
    }


}
