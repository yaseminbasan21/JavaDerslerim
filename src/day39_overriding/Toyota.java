package day39_overriding;

public class Toyota extends Araba {


    protected String hız="Toyota araclar max 220 km hız yapar";
    protected String marka="Toyota";
    protected String sirketMerkezi="Japonya";


    public void motor(){
        System.out.println("Toyota arabalar toyota marka motor kullanır");
    }

    public void garanti(){
        System.out.println("Toyota araclar 10 yıl garantilidir");
    }











}
