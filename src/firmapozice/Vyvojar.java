package firmapozice;

public class Vyvojar extends Zamestnanec{
    private String seznamJazyku;
    public Vyvojar(String jmeno, String prijmeni, String pozice, int plat) {
        super(jmeno, prijmeni, pozice, plat);
        this.seznamJazyku = seznamJazyku;
    }
    public void vypisInfo(){
        System.out.println("SeznamJazyku: " + this.seznamJazyku);
    }
}
