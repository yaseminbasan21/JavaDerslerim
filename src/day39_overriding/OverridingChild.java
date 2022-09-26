package day39_overriding;

public class OverridingChild extends OverridingParent{

    public void method1(){
        System.out.println("Child class method1");
    }

    public static void main(String[] args) {


        /*
        Bir obje olusturulurken Data turu ve Constructor aynı class'dan secilmisse
        Java direkt o class'a gider
        hem variable hem de method icin
        o class'da varsa kullanır,yoksa o class'ın parent'larına bakar
         */

         OverridingChild obj1=new OverridingChild();
         obj1.method1();//Child class method1
         obj1.method2();//Parent class method2

        OverridingParent obj2=new OverridingChild();
        obj2.method2();//Parent class method2
        obj2.method1();//Child class method1


        OverridingParent obj3=new OverridingParent();
        obj3.method2();//Parent class method2
        obj3.method1();//Parent class method1

        /*
        Eger Data turu Parent,Constructor Child class'dan secildiyse
        variable'larda yukarıdaki sekilde calısmaya devam eder
        Ancak
        Methodlar icin Data turunun oldugu class'daki method
        Child class tarafından OVERRİDE edilmis mi diye kontrol etmemiz gerekir
        Eger child class'larda bu method override edilmisse
        override eden method calısır(constructor'ın class'ı)
         */



    }





}
