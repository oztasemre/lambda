import java.util.stream.IntStream;

public class C05 {

        public static void main(String[] args) {
            System.out.println("TASK 01 -->");
            System.out.println(tolamaforIle(10));
            System.out.println(toplaCincix(10));
            System.out.println("   ***   ");


            System.out.println("TASK 02 -->");
            System.out.println(toplaCift(10));
            System.out.println("   ***   ");

            System.out.println("TASK 03 -->");
            System.out.println(ilkXCiftToplm(10));
            System.out.println("   ***   ");

            System.out.println("TASK 04 -->");
            System.out.println(ilkXTekToplm(10));

            System.out.println("   ***   ");

            System.out.println("TASK 05 -->");
            ikininIlkXkuvveti(7);
            System.out.println("   ***   ");

            System.out.println("TASK 06 -->");
            System.out.println("   ***   ");

            System.out.println("TASK 07 -->");
            System.out.println("   ***   ");

            System.out.println("TASK 08 -->");
            System.out.println("   ***   ");

        }

        //TASK 01 --> Structured Programming ve Functional Programming ile 1'den x'e kadar tamsayilari toplayan bir program create ediniz.

        //Structured(AMELE) Programming
    public static int tolamaforIle(int x) {
        int toplam = 0;
        for (int i = 1; i <= x; i++){
            toplam+=i;


    }
        return toplam;
    }

        //Functional(cincix Programming

    public static int toplaCincix(int x) {
        return IntStream.
                range(1, x + 1).//1 den x'e kadar(x dahil) int degerler akısa alındı
                        sum();//akısdakş int degerler toplandı

        //TASK 02 --> 1'den x'e kadar cift tamsayilari toplayan bir program create ediniz.
    }
        public static int toplaCift(int x){

            return IntStream.rangeClosed(1,x).filter(C01::ciftleribul).sum();
        }

        //TASK 03 --> Ilk x pozitif cift sayiyi toplayan program  create ediniz.
        public static int ilkXCiftToplm(int x){
          return IntStream.iterate(2,t->t+2).limit(x).sum();//bir kaynaktan baslayip belli bir kurala gore akisa sokan

        }

        //TASK 04 --> Ilk X pozitif tek tamsayiyi toplayan programi  create ediniz.
        public static int ilkXTekToplm(int x){
            return IntStream.iterate(1,t->t+2).limit(x).sum();

        }

        //TASK 05 --> 2'nin ilk x kuvvetini ekrana yazdiran programi  create ediniz.

    public static void ikininIlkXkuvveti(int x){
        IntStream.iterate(2,t->t*2).limit(x).forEach(C01::yazdir);

    }


        //TASK 06 --> Istenilen bir sayinin ilk x kuvvetini ekrana yazdiran programi  create ediniz.
        public static void istenilenSayininXkadarkuvveti(int istenensayi,int x){
            IntStream.iterate(2,t->t*2).limit(x).forEach(C01::yazdir);

        }

        //TASK 07 --> Istenilen bir sayinin faktoriyelini hesaplayan programi  create ediniz.
        public static void fakteriel(int istenensayi,int x){
            IntStream.rangeClosed(1,x).reduce(1,(t,u)->t*u);

        }

        //TASK 08 --> Istenilen bir sayinin  x. kuvvetini ekrana yazdiran programi  create ediniz.
        public static void isteneSayininXkuvveti(int istenensayi,int x){


        }

    }



