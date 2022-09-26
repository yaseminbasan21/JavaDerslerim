package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {

    public static void main(String[] args) {


        List<String> isimler=new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("İlker");
        isimler.add("Oguzhan");
        System.out.println(isimler);//[Aykut, Yusuf, İlker, Oguzhan]

        //remove (istenenObject) method'u istenen elementi kaldırıp
        //bize true/false doner
        //eger remove işleminin yapıldıgını kontrol etmek istiyorsanız
        //method'u boolean bir variable'a atayabilirsiniz
        boolean sonuc= isimler.remove("Oguzhan");//true











    }

}
