package day49_maps;

import java.util.HashMap;
import java.util.Map;

public class MapOlustur {

    public static Map<Integer,String> myMap(){  //Map olusturan method olusturduk, Map donduruyor
        Map<Integer,String>sınıfList=new HashMap<>();
        sınıfList.put(101,"Ali, Can, Dev");
        sınıfList.put(102,"Veli, Yan, QA");
        sınıfList.put(103,"Ali, Yan, C#");


        return sınıfList;
    }
}
