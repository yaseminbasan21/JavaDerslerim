package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;

public class C03_LinkedList {
    public static void main(String[] args) {

        Deque<Integer> ll1=new LinkedList<>();

        System.out.println(ll1.peek());//Bosken kullanırsak null dondurur
        //System.out.println(ll1.element());//bosken kullanırsak exception fırlatır

        System.out.println(ll1.poll());//bosken kullanırsak null dondurur,bastaki elementi getiriyor normalde
        System.out.println(ll1.pollFirst());//null
        System.out.println(ll1.pollLast());//null

       // ll1.pop();//ilk elemnti siliyor ve donduruyor
                  //ilk elementi bulamazsa exception fırlatır

        ll1.push(30);//Listenin basına element ekler
        ll1.push(20);
        System.out.println(ll1);//[20, 30]

        System.out.println(ll1.remove()); //20 İlk elementi siler ve bize dondurur
        System.out.println(ll1);//[30]
        ll1.push(40);
        System.out.println(ll1);//[40, 30]

        ll1.push(50);
        ll1.remove(50);//object olarak 50'yi siler,,,List'deki remove'da index olarak alıyordu
        ll1.push(30);
        System.out.println(ll1);//[30, 40, 30,]
        ll1.removeLastOccurrence(30);
        System.out.println(ll1);//[30, 40]




    }

}
