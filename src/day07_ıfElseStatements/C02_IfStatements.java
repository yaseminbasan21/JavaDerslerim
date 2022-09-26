package day07_ıfElseStatements;

public class C02_IfStatements {

    public static void main(String[] args) {

      int a=10;
      int b=20;

      if (a>b && b<100){
          System.out.println("isteginiz gerceklesecek");
          System.out.println("body icindeki tum kodlar calısır");

      }

      if (a<0)  System.out.println("Suslu parantez olmazsa sadece bir satır calısır");

         //bir if cumlesinin daha anlasılır olmasını istiyorsanız
         // if body'sini {} icine yazmalısınız
         // body'yi {} icine yazmazsak da if cumlesi calısır
         //ancak ilk ; gordugunde if cumlesi bitmis olur


        //25. satırdaki kod 16. satırdaki if dogru olsa da calısır false olsa da calısır
        System.out.println("2. satır calıstı");












    }

}
