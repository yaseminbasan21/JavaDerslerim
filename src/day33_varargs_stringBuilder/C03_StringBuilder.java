package day33_varargs_stringBuilder;

public class C03_StringBuilder {

    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder("Java cok guzel");
        StringBuilder sb3=new StringBuilder(10);

        System.out.println("sb1 lenght:  "+sb1.length());//sb1 lenght:  0
        System.out.println("sb1 capacity: "+ sb1.capacity());//sb1 capacity: 16

        System.out.println("sb2 lenght:  "+sb2.length());//sb2 lenght:  14
        System.out.println("sb2 capacity: "+ sb2.capacity());//sb2 capacity: 30

        System.out.println("sb3 lenght:  "+sb3.length());//sb3 lenght:  0
        System.out.println("sb3 capacity: "+ sb3.capacity());//sb3 capacity: 10

        //append method'u ile sb'a ekleme yapabiliriz













    }
}
