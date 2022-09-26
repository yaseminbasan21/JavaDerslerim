package day37_inheritance;

import day36_inheritance.Parent;

public class Child extends Parent{

    //Bir class'ı child class yaptıgımızda
    //parent class'daki constructor'a ulasması gerekir
    //bu durumda parent class'taki constructor'ın access modifier'ı
    //uygun bir modifier yapılmalıdır


    Child(){
        super();
        System.out.println("Child class parametresiz constructor");
    }

    Child(int s){
        //Child class'da tum constructor'ların ilk satırına
        //Java'nın yerlestirdigi constructor PARAMETRESİZ'dir yani super()

        System.out.println("Child class parametresiz cons.");
    }

    Child(int sayı1,int sayı2){
        //Eger parent class'dan parametresiz constructor'ı degil de
        //baska bir constuctor'ı calıstırmak isterseniz
        //bunu child class'daki constructor'ın İLK SATIRINA yazmalısınız ,,super() ın icine
        super(sayı1,sayı2);
        System.out.println("Child İki parametreli cons.");
    }

    public static void main(String[] args) {
       Child child=new Child(5,7);
    }





}
