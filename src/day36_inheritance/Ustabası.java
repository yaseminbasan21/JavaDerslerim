package day36_inheritance;

public class Ustabası extends İsci{

    @Override
    public String toString() {
        return "Ustabası{" +
                "statu='" + statu + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Ustabası ustabası1=new Ustabası();
        ustabası1.saatUcreti=15;
        ustabası1.isim="Murat";
        ustabası1.soyisim="Gokcek";
        ustabası1.maas= ustabası1.maasHeaspla();
        ustabası1.statu="Iscı";
        ustabası1.isciStatu="Ustabası";
        System.out.println(ustabası1);


    }




}
