package day36_inheritance;

public class Surekliİsciler extends İsci {

    @Override
    public String toString() {
        return "Surekliİsciler{" +
                "personelNo=" + personelNo +
                '}';
    }

    public static void main(String[] args) {

    Surekliİsciler surIc1=new Surekliİsciler();
    surIc1.personelNo=5001;
    surIc1.isim="Cem";
    surIc1.soyisim="Akay";
    surIc1.statu="Iscı";
    surIc1.saatUcreti=11;
    surIc1.maas= surIc1.maasHeaspla();
        System.out.println(surIc1);




    }

}
