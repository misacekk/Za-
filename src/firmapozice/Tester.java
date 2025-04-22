package firmapozice;

public class Tester extends Zamestnanec{
    private int pocetChyb;
    public Tester(String jmeno, String prijmeni, String pozice, int plat) {
        super(jmeno, prijmeni, pozice, plat);
        this.pocetChyb = 0;
    }
    public void naselJsemNovouChybu(){
        System.out.println("Nasel Jsem novou chybu");
        pocetChyb++;
    }
    @Override
    public void vypisInfo(){
        System.out.println("Jmeno: " + this.jmeno);
        System.out.println("Prijmeni: " + this.prijmeni);
        System.out.println("Pozice: " + this.pozice);
        System.out.println("Plat: " + this.plat);
        System.out.println("PocetChyb: " + this.pocetChyb);
    }
}
