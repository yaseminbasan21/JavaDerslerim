package day32_dateTime;

import java.time.LocalTime;

public class C02_LocalTime {

    public static void main(String[] args) {

        LocalTime tm=LocalTime.now();
        System.out.println(tm);//22:22:04.086399800

        //Bir islemin ne kadar surede bittigini ogrenmek istersek
        //islemden once ve sonra birer time objesi olusturup
        //aradaki farkı hesaplayabiliriz
        int sayı=0;
        for (int i = 0; i <100000 ; i++) {
          sayı+=i;
        }

        LocalTime tmLoopSonrası=LocalTime.now();
        System.out.println(tmLoopSonrası);//22:22:04.090402600

        double nano1=tm.getNano();
        double nano2=tmLoopSonrası.getNano();

        System.out.println("islem "+ (nano2-nano1) + "nanosaniyede bitti");//islem 4002800.0nanosaniyede bitti


        //İleri veya geriye gidebiliriz
        System.out.println(tm.plusMinutes(1000));//15:02:04.086399800


        //istersek zone id kullanarak istedigimiz bolgenin saati icin de obje olusturabiliriz










        //System.out.println(tm);//22:22:04.086399800

    }

}
