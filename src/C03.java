import java.util.*;

public class C03 {
    public static void main(String[] args) {
        List<String> menu = new ArrayList<String>(Arrays.asList("kusleme", "adana", "trileçe", "havucDilim", "buryan",
                "yaglama", "kokrece", "arabAsı", "güvec"));
        System.out.println(menu);
        alfbuyukHarftekrarsiz(menu);
        System.out.println("\n   ***   ");
        characterters(menu);
        System.out.println("\n   ***   ");
        System.out.println("\n   ***   ");
        System.out.println("\n   ***   ");
        System.out.println("\n   ***   ");
        System.out.println("\n   ***   ");
        System.out.println("\n   ***   ");

    }
// Task : List elemanlarini alafabetik buyuk harf ve  tekrarsiz print ediniz.

        public static void alfbuyukHarftekrarsiz(List<String>menu) {
            menu.stream().map(t -> t.toUpperCase(Locale.ROOT)).sorted().
                    distinct(). //distinct() => Bu method tekrarlı elemanları sadece bir kere yazdırır. Bu akışın farklı elemanlarından (Object.equals (Object) 'e göre) oluşan bir akış döndürür.
                               // Sıralı akışlar için, farklı elemanın seçimi sabittir (yinelenen öğeler için, karşılaşma sırasında ilk görünen öğe korunur.)
                              // Sırasız akışlar için, herhangi bir kararlılık garantisi verilmez. Stream return eder.
                    forEach(t -> System.out.print(t + ";"));

        }
// Task : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..
          public static void characterters (List<String>menu) {
        menu.stream().map(t->t.length()).sorted(Comparator.reverseOrder()).distinct().forEach(t-> System.out.print(t+";"));

          }
// Task : List elemanlarini character sayisina gore kckten byk e gore print ediniz..
public static void chacterSayisinaGore (List<String>menu) {
    menu.stream().map(t->t.length()).sorted(Comparator.reverseOrder()).distinct().forEach(t-> System.out.print(t+";"));
}

// Task : list elemanlarinin son harfine gore ters ,tek,sirali print ediniz.
public static void sonHarfGore (List<String>menu) {
    menu.stream().sorted(Comparator.comparing(t -> t.toString().charAt(t.toString().length() - 1)).reversed()).forEach(t -> System.out.print(t + " "));
}
// Task : listin elemanlarin karakterlerinin cift sayili  karelerini hesaplayan,ve karelerini tekrarsiz buyukten kucuge sirali  print ediniz..
    public static void charkarelerciftsiralitekrarsiz(List<String>menu){
        menu
                .stream().
                map(t->t.length()*t.length()).
                filter(C01::ciftleribul).
                distinct().
                sorted(Comparator.reverseOrder()).
                forEach(C01::yazdir);

    }

//Task : List elelmmalarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz.

    public static void karakterSayi7az(List<String>menu){

      boolean kontrol =menu.stream().allMatch(t->t.length()<=7);
      if(kontrol){
          System.out.println("liste elemanlari 7 harfden azlar var ");}else System.out.println("7 harften buyukturler var");


    }



// Task : List elelmanlarinin "W" ile baslamasını kontrol ediniz.
// Task : List elelmanlarinin "x" ile biten en az bir elemaı kontrol ediniz.


// Task : Karakter sayisi en buyuk elemani yazdiriniz.

    public static void karakterSayisienBuyuk(List<String>menu){
        System.out.println(menu.stream().sorted(Comparator.comparing(t -> t.toString().length()).reversed()).findFirst());


    }

// Task : list elemanlarini son harfine göre siralayıp ilk eleman hariç kalan elemanlari print ediniz.

}





