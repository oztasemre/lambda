import java.util.*;
import java.util.stream.Collectors;

public class C04 {
    public static void main(String[] args) {
      //  main method içinde 5 arklı obj'den List create ediniz.

        Universite bogazici = new Universite("bogazici", "matematik", 571, 93);
        Universite itu = new Universite("istanbul teknik", "matematik", 622, 81);
        Universite istanbul = new Universite("istanbul", "hukuk", 1453, 71);
        Universite marmara = new Universite("marmara", "bilgisayar muh", 1071, 77);
        Universite ytu = new Universite("yıldız teknik", "gemi", 333, 74);


        List<Universite> unv = new ArrayList<>(Arrays.asList(bogazici, itu, istanbul, marmara, ytu));
        System.out.println(unv);
        System.out.println(notort74buyuk(unv));
        System.out.println(ogrSayisi110az(unv));
        System.out.println("metemetik varmi "+ matematikVarmi(unv));
        System.out.println(ogrSayisiGoreSira(unv));
        System.out.println("nota gore"+notaGoreilk3sirala(unv));
        System.out.println("sondan2.= "+sondan2orcsayisinaGore(unv));

        not63buyukUnvOgrSayilariTopla(unv);
        System.out.println(not63buyukUnvOgrSayilariToplaToInt(unv));

        System.out.println(ogrtsayisi333notOrtalamasi(unv));
        System.out.println(matSayisi(unv));
        System.out.println(ogrtsayisi571buyuklerinnotortmax(unv));
        System.out.println(ogrtsayisi1071buyuklerinnotortmin(unv));
    }


//task 01--> notOrt'larinin hepsinin 74' den buyuk oldg kontrol eden prg create ediniz.
public static boolean notort74buyuk(List<Universite> unv) {

        return unv.stream().allMatch(t->t.getNotOrt()>74);
}


//task 02-->ogrc sayilarinin   110 den az olmadigini  kontrol eden pr create ediniz.
public static boolean ogrSayisi110az(List<Universite> unv) {
    return unv.stream().allMatch(t->t.getOgrtSayisi()>110);


}

//task 03-->universite'lerde herhangi birinde "matematik" olup olmadigini  kontrol eden pr create ediniz.

    public static boolean matematikVarmi(List<Universite> unv){
      return unv.stream().anyMatch(t->t.getBolum().equalsIgnoreCase("matematik"));

    }

//task 04-->universite'leri ogr sayilarina gore b->k siralayiniz.
public static <list> List<Universite> ogrSayisiGoreSira(List<Universite> unv){
      return unv.stream().sorted(Comparator.comparing(Universite::getOgrtSayisi).reversed())
              .collect(Collectors.toList());

}


//task 05-->universite'leri notOrt gore  b->k siralayip ilk 3 'unu print ediniz.
    public static List<Universite> notaGoreilk3sirala(List<Universite> unv){
       return unv.stream().sorted(Comparator.comparing(Universite::getNotOrt).reversed()).limit(3).collect(Collectors.toList());


    }

//task 06--> ogrc sayisi en az olan 2. universite'yi  print ediniz.

public static List<Universite> sondan2orcsayisinaGore(List<Universite> unv){
   return unv.stream().sorted(Comparator.comparing(Universite::getOgrtSayisi)).limit(2).skip(1).collect(Collectors.toList());
}

//task 07--> notOrt 63 'den buyuk olan universite'lerin ogrc sayilarini toplamini ediniz
public static void not63buyukUnvOgrSayilariTopla(List<Universite> unv){
    System.out.println(unv.stream().filter(t -> t.getNotOrt() > 63).map(t -> t.getOgrtSayisi()).reduce(0,(x,y)->x+y));

}

    //task 07--> notOrt 63 'den buyuk olan universite'lerin ogrc sayilarini toplamini ediniz//toInt
    public static int not63buyukUnvOgrSayilariToplaToInt(List<Universite> unv){
        return unv.stream().filter(t -> t.getNotOrt() > 63).mapToInt(t->t.getOgrtSayisi()).sum();

    }



//task 08--> Ogrenci sayisi 333'dan buyuk olan universite'lerin notOrt'larinin ortalamasini bulunuz.

    public static OptionalDouble ogrtsayisi333notOrtalamasi(List<Universite> unv){
      return unv.stream().filter(t->t.getOgrtSayisi()>333).mapToDouble(t->t.getNotOrt()).average();
    }

//task 09-->"matematik" bolumlerinin sayisini  print ediniz.

    public static int matSayisi(List<Universite> unv) {
       return (int) unv.stream().filter(t->t.getBolum().contains("matematik")).count();
    }




//task 10-->Ogrenci sayilari 571'dan fazla olan universite'lerin en buyuk notOrt'unu bulunuz
public static OptionalInt ogrtsayisi571buyuklerinnotortmax(List<Universite> unv){

    return unv.stream().filter(t -> t.getOgrtSayisi()>571).mapToInt(t->t.getNotOrt()).max();
}

//task 11-->Ogrenci sayilari 1071'dan az olan universite'lerin en kucuk notOrt'unu bulunuz.
public static OptionalInt ogrtsayisi1071buyuklerinnotortmin(List<Universite> unv){

    return unv.stream().filter(t -> t.getOgrtSayisi()<1071).mapToInt(t->t.getNotOrt()).min();
}


}
