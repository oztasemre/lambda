import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class C10pratique {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("ogrenmek");
        list.add("cok");
        list.add("eglencelidi");
        list.add("lambda");
        list.add("gelince");
        list.add("Daha");
        list.add("da");
        list.add("Cok");
        list.add("Eglenceli");
        list.add("Oldu");
        ilkHarflinibuyukYaz(list);

    }
    // S1: ilk harfi d ve ya c olanlari listeleyelim


    //S2: tum stringlerin basina ve sonuna yildiz ekleyerek yazdiralim


    //S3: alfabedik  gore siralayalim list olarak


    //S4: tum 'l' leri silelim yazdiralim


    //S5 : icinde e olanlardan yeni bir list olusturunuz


    // S6 : ilk harfini 3 kere tekrar edip yazalim ornek jjjava gibi


    // S7: tum elemanlarin ilk harfini buyuk digerlerini kucuk yaziniz
    public static void ilkHarflinibuyukYaz(List<String> l) {
        l.stream().map(t -> t.substring(0, 1).toUpperCase(Locale.ROOT) + t.substring(1).toLowerCase(Locale.ROOT)).forEach(t -> System.out.println(t));
    }

    // S8: uzunlugu 4 ve 6 olanlar haric bir liste olusturunuz
    public static void uzunluk4ve6Hairc(List<String> l) {
       // l.stream().filter(t -> t.length() != 4 && t.length() != 6);

    }
}