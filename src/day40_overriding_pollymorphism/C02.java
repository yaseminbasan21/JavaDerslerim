package day40_overriding_pollymorphism;

public class C02 extends C01{

    /*
    @Override notasyonu overridden method ile overriding
    method'u birbirine baglar
    Farkında olunmadan overriden method silinirse veya signature
    degistirilirse bu iliski bozulacagı icin CTE verir

    Notasyon kullanılmazsa Java bunların iliskisini bilir ama
    overridden method silinirse sesini cıkarmaz
     */

    @Override
    public void method2() {
        System.out.println("Child method 2");
    }

    @Override
    protected String method3() {

        //Covariant icin yazıldı
        return "java";
    }
    private void method4(){
        System.out.println("Child method 4");
        //Parent class'daki private method 4'e
        //Child class'dan ulasmamız mumkun olmadıgıdan
        //Java bu iki method'u
        //TAMAMEN FARKLI İKİ METHOD olarak kabul eder
        //@Override kullanmak istersek Java kabul etmez CTE verir
    }

    public static void main(String[] args) {

        C02 obj=new C02();

        obj.method1();//Parent method 1
        obj.method2();//Child method 2

        C01 obj2=new C02();
        obj2.method1();//Parent method 1
        obj2.method2();//Child method 2

        C01 obj3=new C01();
        obj3.method1();//Parent method 1
        obj3.method2();//Parent method 2


    }
}
