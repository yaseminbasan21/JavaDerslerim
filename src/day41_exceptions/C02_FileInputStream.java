package day41_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C02_FileInputStream {
    public static void main(String[] args) {

        /*
        Bir kod yazılırken olası exception'lar ongorulup
        exception olustugunda Java'nın ne yapmasını istedigimiz belirtilmelidir

        1-Eger exception olustugunda kodun calısmasının devam etmesini istemiyorsak
        method isminin yanına olusabilecek exception'ı deklare edebiliriz
        2-Eger exception olussa da kodun calısmaya devam etmesini istiyorsak
        sorun olusturabilecek kodu try catch blogunun icine alır
        try bloguna sorun cıkabilecek kodu
        catch bloguna olusabilecek exception'ı ve
        olası exception durumunda Java'nın ne yapmasını istedigimizi yazabiliriz
         */



        String dosyaYolu="src/day40_exceptions/dosya";

        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

}
