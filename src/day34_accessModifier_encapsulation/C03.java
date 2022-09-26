package day34_accessModifier_encapsulation;

public class C03 {

//Burada encapsule edecegimiz 2 variable olsun

    private int sayı;
    private String str;

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return
                "sayı=" + sayı +
                ", str='" + str ;
    }

    public String  getStr() {
        return str;
    }

    public int getSayı() {
        return sayı;
    }

    public void setSayı(int sayı) {
        this.sayı = sayı;
    }
}
