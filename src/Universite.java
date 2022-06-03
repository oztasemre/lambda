
public class Universite {
    /*
TASK :
fields --> Universite (String)
           bolum (String)
           ogrcSayisi (int)
           notOrt (int)
           olan POJO clas craete edip main method içinde 5 arklı obj'den List create ediniz.
 */
   private String universite;
   private String bolum;
    private int ogrtSayisi;
    private int notOrt;

    public Universite() {
    }


    public Universite(String universite, String bolum, int ogrtSayisi, int notOrt) {
        this.universite = universite;
        this.bolum = bolum;
        this.ogrtSayisi = ogrtSayisi;
        this.notOrt = notOrt;
    }

    public String getUniversite() {
        return universite;
    }

    public void setUniversite(String universite) {
        this.universite = universite;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getOgrtSayisi() {
        return ogrtSayisi;
    }

    public void setOgrtSayisi(int ogrtSayisi) {
        this.ogrtSayisi = ogrtSayisi;
    }

    public int getNotOrt() {
        return notOrt;
    }

    public void setNotOrt(int notOrt) {
        this.notOrt = notOrt;
    }

    @Override
    public String toString() {
        return "universite{" +
                "universite='" + universite + '\'' +
                ", bolum='" + bolum + '\'' +
                ", ogrtSayisi=" + ogrtSayisi +
                ", notOrt=" + notOrt +

                '}';
    }
}