package day32_dateTime;

import java.time.LocalDate;
import java.time.Period;

public class C05_ikiTarihArasınıBulma {

    public static void main(String[] args) {


        LocalDate bugun=LocalDate.now();
        LocalDate dogumGunu=LocalDate.of(1972,01,18);

        System.out.println(Period.between(dogumGunu,bugun));//P50Y2M13D
        System.out.println(Period.between(dogumGunu,bugun).getYears());//50









    }
}
