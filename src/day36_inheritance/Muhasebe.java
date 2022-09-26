package day36_inheritance;

public class Muhasebe extends Personel{

protected int saatUcreti;
protected String statu;
protected int maas;


protected int maasHeaspla(){
    int maas=saatUcreti*8*30;
    return maas;
}

}
