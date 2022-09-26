package day39_overriding;

public class Corolla extends Toyota {


    protected String hız="Corolla max 200 km hız yapar";
    protected String yakıt="Corolla benzinli veya elektriklidir";
    protected String model="Corolla";


    public void motor(){
        System.out.println("Corolla araclar cevreci motor kullanır");
    }

    public void yakıtTuketimi(){
        System.out.println("Corolla 5.6 lt yakıt tuketir");
    }

    public void vitesSayısı(){
        System.out.println("Corolla 5 viteslidir");
    }

    public static void main(String[] args) {

        //Data turu ve constructor farklı oldugunda
        //Constructor calıstıgı icin obje
        //Constructor'ın oldugu class ozelliklerini tasır
        //ancak data turu Parent class secildigi icin
        //variable'lar data turunun secildigi class
        //ve onun Parent class'larından deger alabilir


        //Method'lar icin ise yine Data turunun oldugu class'a gideriz
        //ancak direkt method'u calıstırmadan once method Overrid edilmis mi
        //diye kontrol ederiz


        Corolla arb1=new Corolla();
        System.out.println(arb1.hareket);//Araba
        System.out.println(arb1.hız);//Corolla
        System.out.println(arb1.yakıt);//Corolla
        System.out.println(arb1.marka);//Toyota
        System.out.println(arb1.sirketMerkezi);//Toyota
        System.out.println(arb1.model);//Corolla
        arb1.motor();//Corolla

        Toyota arb2=new Corolla();
        System.out.println(arb2.hareket);//Araba
        System.out.println(arb2.hız);//Toyota
        System.out.println(arb2.yakıt);//Araba
        System.out.println(arb2.marka);//Toyota
        System.out.println(arb2.sirketMerkezi);//Toyota
        //System.out.println(arb2.model);//CTE
        arb2.motor();//Corolla
        arb2.garanti();//Toyota,,,,, garantı methodu overrid edilmedigi icin toyota'daki calısır
        arb2.yakıtTuketimi();//Corolla ,,, Araba class'ında bulur ama constructor'ın oldugu corolla class'ında overrid edildigi icin burda calısır
        //arb2.vitesSayısı(); bulmak icin once parent class'a bakıyoruz,orda da bulamayınca onun parent'ına bakıyoruz
        //geriye de gidemedigimiz icin calısmaz
        //Data turu olan Toyota'dan baslayınca boyle bir method bulamadık,dolayısıyla CTE

        Araba arb3=new Corolla();
        System.out.println(arb3.hareket);//Araba
        System.out.println(arb3.hız);//Araba
        System.out.println(arb3.yakıt);//Araba
        System.out.println(arb3.marka);//Araba
        //System.out.println(arb3.sirketMerkezi);//CTE
        //System.out.println(arb3.model);//CTE

        arb3.motor();//Corolla
        arb3.yakıtTuketimi();//Corolla,,, once data turu olan Araba'ya gitiik orda bulduk,
                             //ancak constructor'ın class'ına baktıgımızda overrid edildigi icin Corolla olur
        //arb3.garanti(); aramaya Araba class'ından baslıyoruz,method'u bulamadı direkt CTE
        //arb3.vitesSayısı();




    }












}
