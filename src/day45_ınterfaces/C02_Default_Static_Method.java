package day45_ınterfaces;

public class C02_Default_Static_Method implements I01_Default_Static {

    /*
    Bir Interface'de default ya da static olarak tanımlanan ve body'si
    olan method'ların override edilmesi MECBURİ DEGİLDİR,opsiyoneldir
    Eger static olarak tanımlanmıssa zaten override edemeyiz
     */


    //static method'lar override edilemez(onceki konulardan ben yazdım)

    @Override
    public void method1() {
        System.out.println("child class method1");
    }

    /*
    Parent Interface'deki default olarak tanımlanan method'u
    istersek override ederiz istemezsek etmeyiz
    override etmezsek,method cagrıldıgında parent Interface'deki calısır
    override edersek child class'daki overriding method calısır
    @Override
    public void method2() {
        System.out.println("child class method2");
    }

     */

    public static void main(String[] args) {
        //Interface'deki static olarak tanımlanan method'lara
        //static yontemlerle ulasılabilir InterfaceIsmı.methodIsmı

        I01_Default_Static.method3();
        C02_Default_Static_Method obj= new C02_Default_Static_Method();
        obj.method1();//Child class
        obj.method2();//Parent Interface
        //obj.method3(); eski classlarda static bir uyeye statik olmayan
        //yollarlada ulasabilirdik
        //ancak Interface icerisinde tanımlanan method'a
        //statik olmayan yontemlerle ulasılamaz



    }

}
