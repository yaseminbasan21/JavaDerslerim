package day39_overriding;

public class Araba {

   protected String hareket="Arabalar teker ile hareket eder";
   protected String hız="Arabalar motor gucune gore hız yaparlar";
   protected String yakıt="Arabalar farklı yakıtlar kullanabilir";
   protected String marka="Arabalar uretildikleri markaya sahiptir";


    public void motor(){
        System.out.println("Arabalar farklı markalarda motor kullanırlar");
    }

    public void yakıtTuketimi(){
        System.out.println("Arabalar mototr gucu ve yakıt turune gore yakıt tuketirler");
    }




}
