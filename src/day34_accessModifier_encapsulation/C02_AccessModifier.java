package day34_accessModifier_encapsulation;

public class C02_AccessModifier {

    public static void main(String[] args) {

        C01 obj=new C01();

        obj.acıkString="Bye";
        C01.acıkSayı=50;

        //C01.sayı=15; private access modifier oldugundan baska class'dan erisilemez

        //obj.method1; private access modifier oldugundan baska class'dan erisilemez

        // C01 objParametreli=new C01(5); Normalde calısırdı ama private yapınca C01!de k,
        //constructor'ı calısmadı


    }
}
