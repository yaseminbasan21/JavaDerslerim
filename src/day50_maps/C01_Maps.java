package day50_maps;

import day49_maps.MapOlustur;

import java.util.*;

public class C01_Maps {
    public static void main(String[] args) {
        //Sınıftaki ogrenci listesini duzenli olarak yazdıralım


        Map<Integer,String> sınıfListMap=MapOlustur.myMap();
        System.out.println(sınıfListMap);//{101=Ali, Can, Dev, 102=Veli, Yan, QA, 103=Ali, Yan, C#}

        //Benim 101,102 ve 103'e bagımsız olarak Map'den ulasma ihtimalim yok
        //o zaman benim bunlara index ile ulasabilecegim bir java yapısına dondurmem lazım

        Set<Integer> sınıfKeySeti=sınıfListMap.keySet();
        //hala set'de index yapısı yok
        //101,102 ve 103'e index yapısıyla ulasamıyorum suan
        //o zaman bu set'deki elementleri index'li bir seye atmam lazım
        //istersek list'e atabiliriz,istersek array'e atabiliriz, bize kalmıs

        //Set'de ki tum elemanları al, bir list'e at diyecegiz
        List<Integer>keyList=new ArrayList<>();
        keyList.addAll(sınıfKeySeti);
        System.out.println(keyList);//[101, 102, 103]
                                    //index yapısını destekleyen hale geldi
        System.out.println(keyList.get(2));//103

        /*
        Eger key'lere tek tek ulasmak istersek
        index yapısına ihtiyacımız var
        ancak map index yapısını desteklemez
        bunun icin key'leri once bir set'e
        sonra da set'in tum elementlerini bir list'e ekledik
         */



        //Simdi de value'leri index ile ulasabilecegimiz bir sekle sokalım

        Collection<String>sınıfValueColl=sınıfListMap.values();
        System.out.println(sınıfValueColl);//[Ali, Can, Dev, Veli, Yan, QA, Ali, Yan, C#]
        System.out.println(sınıfValueColl.size());//3

        List<String>sınıfValueList=new ArrayList<>();
        sınıfValueList.addAll(sınıfValueColl);
        System.out.println(sınıfValueList);//[Ali, Can, Dev, Veli, Yan, QA, Ali, Yan, C#]

        /*her bir value birden fazla bilgiyi iceriyor
        onun icin value'ları multidimensional bir array'e atmak mantıklı duruyor
        ancak MDA olusturmak icin boyutları bilmeye ihtiyacımız var

         */
        int outerArrayBoyut=sınıfValueList.size();
        System.out.println(outerArrayBoyut);//3

        //inner array'lerin boyutunu bulmak biraz daha kompleks olucak

        String ilkValue=sınıfValueList.get(0);
        System.out.println(ilkValue);//Ali, Can, Dev
        String ilkValueArray[]=ilkValue.split(",");
        int innerArrayBoyut=ilkValueArray.length;

        String valueMDArr[][]=new String[outerArrayBoyut][innerArrayBoyut];

        for (int i = 0; i <outerArrayBoyut ; i++) {
            String temp[]=sınıfValueList.get(i).split(",");
            for (int j = 0; j <innerArrayBoyut ; j++) {

                valueMDArr[i][j]=temp[j];



            }
        }

        System.out.println(Arrays.deepToString(valueMDArr));//[[Ali,  Can,  Dev], [Veli,  Yan,  QA], [Ali,  Yan,  C#]]


        /*
        Bu satıra kadar key'leri index ile ulasabildigim keyList'e atadım
        value'leri valueMDArr'e atadım
        simdi bu key ve value'leri istedigim gibi manipule edebilirim
         */

        System.out.println("Numara    Isım    Soyisim     Brans");
        System.out.println("====================================");

        for (int i = 0; i < keyList.size() ; i++) {
            System.out.print(keyList.get(i)+" ");
            for (int j = 0; j <innerArrayBoyut ; j++) {
                System.out.print(valueMDArr[i][j]+" ");

            }
            System.out.println("");
        }
        //Numara    Isım    Soyisim     Brans
        //====================================
        //101 Ali  Can  Dev
        //102 Veli  Yan  QA
        //103 Ali  Yan  C#




    }
}
