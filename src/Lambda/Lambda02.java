package Lambda;

public class Lambda02 {

    public static void main(String[] args) {




    }//map()--> Stream içerisindeki elemanları başka tiplere dönüştürmek veya
    // üzerlerinde işlem yapmak (update) için Map kullanılmaktadır.
}


     // Task : Functional Programming ile listin tek elemanlarinin  kuplerinin bir fazlasini
     // ayni satirda aralarina bosluk birakarak print edi

/*
 reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
 kullanımı yaygındır pratiktir.
 Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme sürecinde, bir önceki adımda elde edilen sonuç
 bir sonraki adıma girdi olarak sunulmaktadır. Bu sayede yığılmlı bir hesaplama süreci elde edilmiş olmaktadır.
 reduce metodu ilk parametrede identity değeri, ikinci parametrede ise BinaryOperator türünden bir obj kullanılır.
 reduce işleminde bir önceki hesaplanmış değer ile sıradaki değer bir işleme tabi tutulmaktadır.
 İşleme başlarken bir önceki değer olmadığı için bu değer identity parametresinde tanımlanmaktadır.

 */


// Task : List'in cift elemanlarin karelerinin en buyugunu print ediniz











