package day36_inheritance;

public class Parent {


   protected Parent(){//protected yazdık ki day 37 de olan child da ulasabilsin
        System.out.println("Parent parametresiz constructor calıstı");
    }

    protected Parent(int sayı3,int sayı4){
        System.out.println("Parent 2 parametreli cons.");
    }

    protected int sayı;

}
