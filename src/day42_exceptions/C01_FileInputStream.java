package day42_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_FileInputStream {
    public static void main(String[] args) {

        String dosyaYolu="src/day41_exceptions/dosya";

        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
            int k=0;
            while ((k=fis.read())!=-1){
                System.out.print((char)k);
            }
        } catch (FileNotFoundException e) {//Ya dosyayı bulamazsam exception'ı
            e.printStackTrace();
        } catch (IOException e) {// dosyayı buldum,ama okuyamazsam exception'ı
            e.printStackTrace();
        }

        /*
        Exception'lar icinde Parent-Child iliskisi mevcuttur
        Eger bir kod icin birden fazla exception olusma ihtimali varsa
        Oncelikle olası exception'lar Parent-Child iliskisi tasıyor mu bakmamız gerekir
        Eger Parent-Child iliskisi yoksa istedigimiz sırada catch cumleleri olusturabiliriz

        Eger Parent-Child iliskisi varsa
        sadece parent exception'ı yazabiliriz
        veya ikisini de yazmak istersek
        child'ı once, parent'ı sonra yazmalıyız
         */



        /*
        Altı kırmızı cizili her kod CTE degildir
        Java syntax hatalarını derleme esnasında (compile) farkeder ve altını cizer
        biz bugune kadar tamamına CTE diyorduk ancak
        exception konusu ile birlikte
        Compile Time Exception kavramı da hayatımıza girdi
         */



    }



}
