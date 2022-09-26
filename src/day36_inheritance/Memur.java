package day36_inheritance;

public class Memur extends Muhasebe{


  @Override
  public String toString() {
    return "Memur{" +
            "saatUcreti=" + saatUcreti +
            '}';
  }

  public static void main(String[] args) {

    Memur memur1=new Memur();
    //memur1 objesi Memur class'ının objesi olmasına ragmen
    //inherit ettigi muhasebe ve onun da Parent'ı olan Personel
    //class'larındaki tum dataları alabilir

    //Personel class'ından
    memur1.personelNo=1001;
    memur1.isim="Ahmet";
    memur1.soyisim="Tepecik";
    memur1.adres="Ankara";
    memur1.tel="3125756595";

    //Muhasebe class'ından
    memur1.saatUcreti=10;
    memur1.maas= memur1.maasHeaspla();
    memur1.statu="Memur";

    System.out.println(memur1);

    Memur memur2=new Memur();
    memur2.personelNo=1002;
    memur2.saatUcreti=10;
    memur2.maas= memur2.maasHeaspla();

    System.out.println(memur2);




  }





}
