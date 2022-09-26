package day15_methodCreation;

public class C06_MethodCreation {

    public static void main(String[] args) {

        int a=10;
        int b=20;

        //iki variable'ın degerini toplayan bir method oluşturalım

        //1.adım:method adını yazalım
        //2.adım:method'a gondermem gereken arguman var mı?

        ikiSayıTopla(25,50);
        C04.dortHarfiTersineCevir("yase");


    }
          //Bir method'u oluşturmak calışması icin yeterlı degildir  (or/method'u olusturduktan sonra main method'dan silersek calısmaz)
          //method ancak cagrılırsa calısır
          //aynı class veya farklı class'larda olmasının hic bir onemi yoktur
          //Java main method'da yukarıdan asagı dogru calısır
          //ve geldigi satırı calıstırır

    private static void ikiSayıTopla(int a, int b) {
        System.out.println("Verilen iki sayının toplamı: "+(a+b));
    }


}
