package firmapozice;

public class Manager extends Zamestnanec {
    private int pocetRizenych;
    public Manager(String jmeno, String prijmeni, String pozice, int plat) {
        super(jmeno, prijmeni, pozice, plat);
        this.pocetRizenych = pocetRizenych;
    }
    public void vypisInfo(){
        System.out.println("PocetRizenych: " + this.pocetRizenych);
    }
}
