package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;

public class C02_LinkedList {
    public static void main(String[] args) {

        //List'den gelen ozellikleri biliyoruz
        //onun icin Deque'den gelen ozelliklere bakalım

        Deque<Integer>ll1=new LinkedList<>();  //(LinkedList diyoruz cunku deque dersek olmaz cunku Interface de obje olusturamayız)
        ll1.addFirst(10);//basa eleman ekler, (add() methodu'na gore daha hızlıdır)
        ll1.addLast(20);//sona element ekler
        System.out.println(ll1);//[10, 20]
        System.out.println(ll1.element());//10 İlk elementi silmeden bize dondurur
                                          // İlk element yoksa exception fırlatır
        System.out.println(ll1);//[10, 20]

        System.out.println(ll1.getLast());//20 Son elementi silmeden bize dondurur
        System.out.println(ll1.getFirst());//10 İlk elementi silmeden bize dondurur

        ll1.offer(30); //Sona ekler ama bize bir sey dondurmez
        System.out.println(ll1);//[10, 20, 30]
        ll1.offerLast(40); //Sona ekler ve bize true dondurur
        System.out.println(ll1);//[10, 20, 30, 40]
        ll1.offerFirst(50);
        System.out.println(ll1);//[50, 10, 20, 30, 40]

        System.out.println(ll1.peek());//50 İlk elementi silmeden bize dondurur,
                                       //bulamazsa null donduruyor



    }

}
