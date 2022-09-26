package day47_linkedList;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {

        /*LinkedList'in 2 tane parent Interface'ı vardır
          LinkedList olustururken data turu olarak;
          LinkedList secersek 2 parent'daki tum method'lar kullanılabilir
          List secersek: sadece List Interface'ındeki method'lar
          Deque/Queue secersek: Deque'deki method'ları kullanabiliriz
         */

        LinkedList<Integer> ll1=new LinkedList<>();
        ll1.add(10); //LinkedList class'ından bu method'u calıstırır


        //Sadece List Interface'ınden ozellikler kullanmak istersek

        List<Integer>ll2=new LinkedList<>();
        ll2.add(10);
        ll2.remove(0);
        System.out.println(ll2);

        //Sadece Deque'den gelen ozellikleri kullanalım

        Deque<Integer>ll3=new LinkedList<>();
        ll3.addLast(20);
        ll3.addFirst(15);
        System.out.println(ll3);//[15, 20]

        ll3.addLast(40);
        System.out.println(ll3);//[15, 20, 40]



    }

}
