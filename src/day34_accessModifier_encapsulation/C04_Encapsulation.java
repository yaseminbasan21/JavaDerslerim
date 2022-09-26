package day34_accessModifier_encapsulation;

public class C04_Encapsulation {
    //Bir variable'ı encapsule etmek icin
    //1-Access modifier'ı private
    //2-Okuma ve yazma ozelliklerinin kullanılmasını istedigimiz sınırlayabiliriz
    //          -Eger sadece okunmasını istiyorsanız getter
    //          -Sadece deger girilebilsin ama okunamasın isterseniz setter methodlarını olustururuz

    //  Bir variable icin hem getter hem setter olusturursanız
    // o variable public olmus gibi hem okuyup hem de yazılmasını saglayabilirsiniz
    //Piyasada developer'lar arasında genel uygulama da boyledir

    //getter ve setter yetkilerin sınırlandırılabilmesi icin yapılan bir uygulama (kendim yazdım)
    public static void main(String[] args) {

        C03 obj=new C03();

        System.out.println(obj.getSayı());//0

        obj.setStr("Java,java,java");

        System.out.println(obj.getStr());//Java,java,java

        System.out.println(obj);//sayı=0, str='Java,java,java
        //code kısmından toString yaptıgımızda direkt cıkıyor



        //OOP concept'e alısabilmek icin genelde butun variable ve butun methodları ayrı bir class'da olusturuyolar
        //baska bir class'dan da istedikleri seyleri yapıyorlar
        //Bir proje'nin alt yapısını kurucaz, bir dosyamız orda, bir dosyamız burda olucak
        //ve 5 farklı yerden dosyayı alıp, bir class'da kullanıcaz
        //data'ların derli toplu olması icin en guzeli bu
        //(kendim yazdım)

    }
}
