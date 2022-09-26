package day33_varargs_stringBuilder;

public class C02_Varargs {

    public static void main(String[] args) {

        //Parametre olarak bir int
        // ve istedigimiz kadar String alan
        //en uzun kelimenin harf sayısı ile int parametre degerini
        //carpıp sonucu yazdıran bir method olusturun

        int sayı=5;
        String str1="Zulal";
        String str2="Zeynep";

        carpım(sayı,str1,str2);

        //Bir method'da varargs dısında parametre kullanacaksak
        //once diger parametreleri yazıp, varargs'ı en sona yazmalıyız
        //Bu sebeple bir method'da birden fazla Varargs olamaz

    }

    private static void carpım(int sayı, String... str) {
        String enUzunStr="";
        for (String each:str
        ) {
            if (each.length()>enUzunStr.length()){
                enUzunStr=each;
            }
        }
        System.out.println("Istenen deger: "+ sayı* enUzunStr.length());
    }


}




