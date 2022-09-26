package day17_forLoop;

public class C07_ForLoop {

    public static void main(String[] args) {

        //Soru 6 Interview Question) Kullanıcıdan 100'den kucuk bir tamsayı isteyin
        // 1'den baslayarak girilen sayıya kadar tum sayıları yazdırın
        // -Sayı 3'un katı ise sayı yerine "Java" yazdırın
        // -Sayı 5'in katı ise sayı yerine "Guzeldır" yazdırın
        // -Sayı hem 3'un hem 5'in katı ise sayı yerine "Java Guzeldir" yazdırın

        int sayı=60;

        for (int i = 1; i<=sayı ; i++) {
            if (i%3==0 && i%5==0){
                System.out.print(" Java Guzeldir");
            }else if (i%3==0){
                System.out.print(" Java");
            }else if (i%5==0){
                System.out.print(" Guzeldir");
            }else{
                System.out.print(i+" ");
            }
        }


    }



}
