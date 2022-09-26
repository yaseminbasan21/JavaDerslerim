package day11_StringManipulation;

public class C05_indexOf {

    public static void main(String[] args) {

    String str1="Java bir baska guzel";
    //istersek char olarak verdigimiz bir harfin index'ini dondurur
        System.out.println(str1.indexOf('J'));//0

        //istersek bir harf ya da metin olarak verdigimiz String'in index'ini dondurur
        System.out.println(str1.indexOf('l'));//19
        System.out.println(str1.indexOf("aska"));//10
        System.out.println(str1.length()-1);//19

        //aynı harften birden fazla varsa buldugu ilk dogru eslesmenin index'ini dondurur
        System.out.println(str1.indexOf("b"));//5

        System.out.println(str1.indexOf('b',5));
        //bu method'da java aramaya fromIndex olarak yazdıgımız index'den baslar
        //(inclusive)

        //verilen String'deki 2. a harfinin index'ini bulalım
        int ilkIndex=str1.indexOf('a');//1
        System.out.println(str1.indexOf('a',ilkIndex+1));//3

        //verilen String'deki 2.b harfinin index'ini bulalım
        int ilkbIndex=str1.indexOf('b');//5
        System.out.println(str1.indexOf('b',ilkbIndex+1));//9


        //

    }

}
