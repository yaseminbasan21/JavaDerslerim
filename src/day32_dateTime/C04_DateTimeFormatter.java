package day32_dateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormatter {

    public static void main(String[] args) {

        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println(tarihSaat);//2022-03-31T22:48:07.517054100

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MMM/YYYY");
        System.out.println(formatter.format(tarihSaat));//31/Mar/2022

         DateTimeFormatter formattersaat=DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(formattersaat.format(tarihSaat));//22:55

    }




}
