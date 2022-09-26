package day43_garbage_abstractClass;

public abstract class C03_ilkAbstractClass {

    public abstract void AbstractMethod();

    /*
    Abstract method'lar
    child class'ların MUTLAKA override etmesi gereken method'lardır
    dolayısıyla HICBIR ZAMAN direkt calıstırılmazlar
    ve bu sebeple method body'sine ihtiyac yoktur

    bir class'ın veya method'un abstract olup olmadıgını anlayabilir miyiz?
    -abstract yazıyorsa abstractır, yazmıyorsa degildir
    (abstract olmayan class'lara concrete class/method denir)

    Abstract method'lar body'e sahip olamaz
    Concrete method'lar ise method body'si olmadan olusturulamaz
     */


}
