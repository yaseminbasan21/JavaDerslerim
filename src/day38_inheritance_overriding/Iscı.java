package day38_inheritance_overriding;

public class Iscı extends Personel {
    public String statu="Isci";
    public String haklar="Isciler kıdem tazminatı alırlar";
    public String ikramiye="Isciler yılda bir ikramiye alır";

    public void mesai(){
        System.out.println("Tum ısciler haftalık 40 saat calısır");
    }

    public void maasHesapla(){

        System.out.println("Tum ıscıler 30 gun * 8 saat * 11 euro = " +(30*8*11)+ "Euro maas alırlar" );
    }


}
