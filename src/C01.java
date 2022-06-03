import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01 {
    public static void main(String[] args) {
/*
	 	1) Lambda "Functional Programming"-->mathod(action) kullanma pr dili.
	 	   Lambda --> mathod create  etme değil mevcut method'ları(library)secip kullanmaktır...
	       Lambda  kendi başına tanımlanabilen parametre alıp gönderebilen fonksiyonlardır.
	 	   Lambda’lar sayesinde daha az kod ve hızlı geliştirme sağlanabilmektedir.
	   	   Java 8 ile gelen bu özellik, Java 8’in en önemli özelliğidir.

	 		"Functional Programming" de "Nasil yaparim?" degil "Ne yaparim?" dusunulur.
	 	2) "Structured Programming" de "Ne yaparim?" dan cok "Nasil Yaparim?" dusunulur
	 	3) "Functional Programming" hiz, code kisaligi, code okunabilirligi
	     	ve hatasiz code yazma acilarindan cok faydalidir.
	 	4) Lambda sadece collections'larda(List, Queue ve Set) ve array'lerde kullanilabilir ancak map'lerde kullanılmaz.
           Lambda kullanmak hatasız code kullanmaktır.

            Collections Nedir?
            Çoğu yazılım tek tek öğeler yerine öğelerden oluşan toplulukları depolar ve onlar üzerinde işlem
            yapar. Array’ler onlardan birisidir. Java Collections Framework, arraylerle yapılan işleri daha kolay
            yaptığı gibi, daha fazlasını da yapar.
            Java’da bir koleksiyon (collection - bazen container, ambar diye adlandırılır) nesnelerden oluşan bir
            topluluğu bir arada tutan bir yapıdır. ‘Collections Framework’ ise arayüzler ve onların kurgularından
            (implementations) oluşur.
	 */

        List<Integer> sayi = new ArrayList<>(Arrays.asList(34, 22, 16, 11, 35, 20, 63, 21, 65, 64, 81, 38, 15));
printElStructured(sayi);
System.out.println("");
printElFunctional(sayi);
System.out.println("");
printElFunctional2(sayi);
System.out.println("");
printElFunctional3(sayi);
System.out.println("");
structuredCiftSayilar(sayi);
System.out.println("");
fonctionalCiftSayilar(sayi);
System.out.println("");
fonctionalCiftSayilarseed(sayi);
System.out.println("");
ciftVe34buyuk(sayi);
System.out.println("");
ciftveya34Buyuk(sayi);

    }

    //Task : "Structured Programming" kullanarak list elemanlarını aynı satirda aralarında bosluk olacak sekilde print ediniz.method yaziniz
    public static void printElStructured(List<Integer> sayi) {
    for(Integer w:sayi){
        System.out.print(w+" ");
    }
    }

    //Task : "functional Programming" kullanarak list elemanlarını aynı satirda aralarında bosluk olacak sekilde print ediniz.
    public static void printElFunctional(List<Integer> sayi){

    sayi.stream().forEach(t-> System.out.print(t+" "));

    }

     /*
        stream() : datalari yukaridan asagiya akis sekline getirir. Stream bir interface olduğundan dolayı doğrudan nesne almaz.
        forEach() :datanin parametresine gore her bir elemanı isler
        t-> : Lambda operatoru
         Lambda Expression-->(parameter list) -> {action body}
             Parameter list: Fonksiyonun parametreleri tanımlanır. Hiç parametre geçirmeden boşta olabilir.
             -> Arrow-token: Argüman listesi ile expression gövdesini birbirine bağlamak için kullanılır.
             Body: Expressionları ve statementları içerir.

            Bir kod bloğundan oluşan bir body...
            Bu tip lambda body, block body olarak bilinir. Blok gövdesi, lambda gövdesinin birden çok ifade içermesine izin verir.
            Bu ifadeler parantez içine alınır ve parantezlerden sonra noktalı virgül eklemeniz gerekir.

                () -> {
                 double pi = 3.1415;
                    return pi;
                };
         Lambda Expression  yapisi cok tavsiye edilmez daha cok METHOD REFERENCE kullanilir

        */
     public static void printElFunctional2(List<Integer> sayi){
         //bu yapi bizden isteneni karsilamadigindan
         // assagida bir seed method olusturduk

         sayi.stream().forEach(System.out::print);

     }
     //verilen int degeri ayni satirda bosluk birakarak yazdiran bir seed method yazdik
     public static void yazdir(int a){
         System.out.print(a+" ");
     }
    public static void printElFunctional3(List<Integer> sayi){

        sayi.stream().forEach(C01::yazdir);

    }
    // Task : structured Programming ile list elemanlarinin  cift olanalrini ayni satirda aralarina bosluk birakarak print ediniz.
public static void structuredCiftSayilar(List<Integer> sayi) {
    for (Integer w : sayi) {
        if (w % 2 == 0) {
            System.out.print(w + " ");
        }}
}
    //Task : functional Programming ile list elemanlarinin  cift olanalrini ayni satirda aralarina bosluk birakarak print ediniz.
public static void fonctionalCiftSayilar(List<Integer>sayi){
         sayi.stream().filter(t->t%2==0).forEach(C01::yazdir);

}//seed bir method yazdik sayi cift mi tek mi
public static boolean ciftleribul (int a){

    return a%2==0;
}
    //Task : functional Programming ile list elemanlarinin  cift olanalrini ayni satirda aralarina bosluk birakarak print ediniz.
    public static void fonctionalCiftSayilarseed(List<Integer>sayi){
        sayi.stream().
        filter(C01::ciftleribul).
        forEach(C01::yazdir);

    }
//Task : functional Programming ile list elemanlarinin 34 den kucuk cift olanalrini ayni satirda aralarina bosluk birakarak print ediniz.
public static void ciftVe34buyuk(List<Integer>sayi) {
    sayi.stream().filter(C01::ciftleribul).filter(t -> t < 34).forEach(C01::yazdir);
}
 //Task : functional Programming ile list elemanlarinin 34 den buyk veya cift olanalrini ayni satirda aralarina bosluk birakarak print ediniz.
public static void ciftveya34Buyuk(List<Integer>sayi){
         sayi.stream().filter(t->t%2==0 || t>34).forEach(C01::yazdir);

    }





}



