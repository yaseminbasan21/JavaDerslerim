package day15_methodCreation;

public class C04 {

    //main method olmadan da bir class olusturulabilir
    //Ancak bu class direkt calısmaz
    //sadece depo gorevi gorur
    //baska class'lardan kullanılabilecek method veya variable'ları barındırır


    public static void besHarfiTersineCevir(String kelime) {
        String tersKelime=kelime.substring(4)+
                kelime.substring(3,4)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("Girdiginiz kelimedeki harf sayısı : "+ kelime.length());
        System.out.println("Girdiginiz kelimenin tersten yazılısı: "+tersKelime);
    }

    public static void dortHarfiTersineCevir(String kelime) {
        String tersKelime=kelime.substring(3)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("Girdiginiz kelimedeki harf sayısı : "+ kelime.length());
        System.out.println("Girdiginiz kelimenin tersten yazılısı: "+tersKelime);
    }






}







