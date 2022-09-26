package day43_garbage_abstractClass;

public abstract class C04 {

    /*
    Bir abstract class'da abstract veya concrete method'lar bulunablir
    Child Class'ların abstract method'ları override etmesi MECBURİ iken
                      concrete method'ların override edilmesi OPSİYONEL'dir


     */

    public abstract void absmethod();  //abstract method'un body'si olmaz

    public void concreteMethod(){
        System.out.println("C04 concrete method");
    }
    public static void concreteStaticMethod(){
        System.out.println("C04 concrete static method");
    }

    public static void main(String[] args) {
        //C04 obj=new C04();
        /*
        abstract class'lar constructor'a sahiptir
        ancak abstract class'lardan OBJE OLUSTURULAMAZ

        Abstract class'lar obje barındırmayan
        sadece child class'lar icin
        UYULMASI SART OLAN veya OPSİYONEL bırakılan
        ozellikleri tanımladıgımız bir depo class gibidir
         */
        System.out.println("Bu class abstract");
        concreteStaticMethod();
    }

}
