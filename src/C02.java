import java.util.*;

public class C02 {



    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(4,2,6,1,-5,7,3,8));
        System.out.println(sayi);
        ciftKareprint(sayi);
        System.out.println("");
        tekkupArti1(sayi);
        System.out.println("");
        karekokcift(sayi);
        System.out.println("");
        enBuyukEleman(sayi);
        System.out.println("");
        ciftEnbuyukKare(sayi);
        System.out.println("");
        elemanlarintoplami(sayi);
        System.out.println("");
        cftTplam(sayi);

        System.out.println("");
        minbul(sayi);
        System.out.println("");
        besbuyukenkucuktek(sayi);
        System.out.println("");
        ciftkaresira(sayi);
        System.out.println("");
        tekkarebuyuktenkucuk(sayi);








    }
    // Task : Functional Programming ile cift elemanlarin karelerini bosluk bırakarak print ediniz
  public static void ciftKareprint( List<Integer> sayi){
        sayi.stream().filter(C01::ciftleribul).map(t->t*t).forEach(C01::yazdir);

//map()--> Stream içerisindeki elemanları başka tiplere dönüştürmek veya
// üzerlerinde işlem yapmak (update) için Map kullanılmaktadır.
  }

// Task : Functional Programming ile listin tek elemanlarinin  kuplerinin bir
// fazlasini ayni satirda aralarina bosluk birakarak print edi
    public static void tekkupArti1( List<Integer> sayi){
        sayi.stream().filter(t->t%2!=0).map(t->(t*t*t)+1).forEach(C01::yazdir);
    }

// Task : Functional Programming ile listin cift elemanlarinin
// karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz
public static void karekokcift( List<Integer> sayi){
        sayi.stream().
                filter(C01::ciftleribul).
                map(Math::sqrt).
                forEach(t-> System.out.print(t+" "));

}
// Task : list'in en buyuk elemanini yazdiriniz
    public static void enBuyukEleman(List<Integer> sayi){
       Optional<Integer> maxsayi= sayi.stream().reduce(Math::max); //akisa giren elamanlari istenen islemden tek halde dondururur
        System.out.println(maxsayi);                                  //reduce sonuna method almaz bu yuzden
    }
// Task : List'in cift elemanlarin karelerinin en buyugunu print ediniz
    public static void ciftEnbuyukKare(List<Integer> sayi){
        System.out.println(sayi.stream().filter(C01::ciftleribul).map(t->t*t).reduce(Math::max));

    }

    // Task : List'teki tum elemanlarin toplamini yazdiriniz.
//Lambda Expression...
    public static void elemanlarintoplami(List<Integer> sayi) {
        int sayilarToplman=sayi.stream().reduce(0, (x, y) -> x + y);
        System.out.println(sayilarToplman);

    }
// Task : List'teki cift elemanlarin carpimini  yazdiriniz.
    public static void cftTplam(List<Integer> sayi){
        System.out.println("emre");
      sayi.stream().filter(C01::ciftleribul).map(t->t*t).forEach(C01::yazdir);
    }

    // Task : List'teki elemanlardan en kucugunu 4 farklı yontem ile print ediniz.
//1. yontem Method Reference --> Integer class
    public static void minbul(List<Integer> sayi) {

        Optional<Integer> minsayi=sayi.stream().reduce(Integer::min);
        System.out.println(minsayi);


//2. yontem Method Reference --> Math class
   Optional<Integer> minsayi2=sayi.stream().reduce(Math::min);
        System.out.println(minsayi2);

//3. yontem Lambda Expression
        int minsayi3=sayi.stream().reduce(Integer.MAX_VALUE,(x,y) ->x<y?x:y);
        System.out.println(minsayi3);
//4. yontem Method Reference --> Haluk class

    }

// Task : List'teki 5'ten buyuk en kucuk tek sayiyi print ediniz.
    public static void besbuyukenkucuktek (List<Integer> sayi){
        System.out.println(sayi.stream().filter(t -> t % 2 != 0 && t > 5).reduce(Integer::min));
    }
// Task : list'in cift  elemanlarinin karelerini  kucukten buyuge print ediniz.
    public static void ciftkaresira(List<Integer> sayi){
        sayi.stream().
                filter(C01::ciftleribul).
                map(t->t*t).
                sorted().   //sorted() => Doğal düzene göre sıralanmış, bu akışın elemanlarında oluşan bir akış döndürür.
                            //Sorted() methodu tekrarlı kullanılırsa en son kullanılan aktif olur.
                forEach(C01::yazdir);



    }


// Task : list'in tek  elemanlarinin kareleri ni buykten kucuge  print ediniz.

    public static void tekkarebuyuktenkucuk(List<Integer> sayi){
        sayi.stream().
                filter(t->t%2!=0).
                map(t ->t*t).
                sorted(Comparator.reverseOrder()).forEach(C01::yazdir);
    }





}
