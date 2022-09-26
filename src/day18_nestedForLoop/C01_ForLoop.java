package day18_nestedForLoop;

public class C01_ForLoop {

    public static void main(String[] args) {

        //Soru11 Interview Question ) Kullanıcıdan 10'dan kucuk bir tamsayı isteyin
        //ve girilen sayının faktoryel'ini bulun (5!=5*4*3*2*1)

        int input=9;
        int faktoryel=1;

        for (int i = 9; i >=1 ; i--) {
               faktoryel*=i;
        }
        System.out.println(input+" ! = "+faktoryel);






    }




}
