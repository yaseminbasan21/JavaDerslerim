package day33_varargs_stringBuilder;

public class C01_Varargs {

    public static void main(String[] args) {

   //Kac tane String verilirse verilsin iclerinden en uzunu yazdıran bir method olusturun
   String str1="Ali";
   String str2="Veli";
   String str3="Oguzhan";

   enUzunKelime(str1,str2,str3);



    }

    private static void enUzunKelime(String... str) {
        String enUzunStr="";
        for (String each:str
             ) {
            if (each.length()>enUzunStr.length()){
                enUzunStr=each;
            }
        }
    }


}
