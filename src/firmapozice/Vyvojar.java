package firmapozice;

public class Vyvojar extends Zamestnanec{
    private String seznamJazyku;
    public Vyvojar(String jmeno, String prijmeni, String pozice, int plat, String seznamJazyku) {
        super(jmeno, prijmeni, pozice, plat);
        this.seznamJazyku = seznamJazyku;
    }
    public void vypisInfo(){
        System.out.println("Jmeno: " + this.jmeno);
        System.out.println("Prijmeni: " + this.prijmeni);
        System.out.println("Pozice: " + this.pozice);
        System.out.println("Plat: " + this.plat);
        System.out.println("SeznamJazyku: " + this.seznamJazyku);
    }
}
