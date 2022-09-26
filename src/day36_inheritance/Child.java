package day36_inheritance;

public class Child extends Parent{

    Child(){
        super();//gorsekte burda,gormesekte burda  ,, her child class'ın constructor'ının ilk satırında yazar
        System.out.println("Child constructor calıstı");

        //Parent constructor calıstı
        //Child constructor calıstı
        //Child class oldugu zaman direkt child constructor'ını dondurmez,
        //Parent class'ına da gidip ordaki constructor'ı dondurur once,child class'ından once parent class'ı calısır yani
        //(kendim yazdım)

    }

    //Tum class'larda biz gormesek bile
    //Java'nın olusturdugu default constructor vardır

    //Extends keyword kullanan class'lardaki
    //Tum CONSTRUCTOR'ların ilk satırında
    //biz gormesek bile super()
    //constructor call vardır
    //yani parent class'ın parametresiz constructor call

    public static void main(String[] args) {

        Child child=new Child();
    }


    //super() otomatik'tir yani gorunmese de arka planda calısır,
    //istersek manuel olarak da super() yazabiliriz
    //(kendim yazdım)


    //extends kelimesi olmadıgı zaman normalde bir class'da obje olusturdugumuz zaman
    //sadece o class'taki bilgilere ulasabiliyoduk
    //ama extends kelimesi oldugu zaman,bizim objemiz her ne kadar child class'ından olsa da
    //parent class'ında butun ozelliklerine sahip,
    //dolayısıyla arka planda bu parent class'ında tum ozelliklerine sahip olması icin
    //parent class'daki constructor'ında calısması gerekir



    //her object kendi class'ının ozelliklerini tasır,
    // ama inheritance sayesinde her child class
    // parent class'ında ozelliklerine sahip olabilir
    //bunun icin java arka planda boyle bir mekanizma kurmus ,,,super()!!!
    //super() sayesinde parent'a gidiyor tum bilgileri toplayıp en son yazdırıyor


    //super() den onceki satıra baska bir call yazarsak super() olmus olur


}
