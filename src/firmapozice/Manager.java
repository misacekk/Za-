package firmapozice;

public class Manager extends Zamestnanec {
    private int pocetRizenych;
    public Manager(String jmeno, String prijmeni, String pozice, int plat, int pocetRizenych) {
        super(jmeno, prijmeni, pozice, plat);
        this.pocetRizenych = pocetRizenych;
    }
    public void vypisInfo(){
        System.out.println("Jmeno: " + this.jmeno);
        System.out.println("Prijmeni: " + this.prijmeni);
        System.out.println("Pozice: " + this.pozice);
        System.out.println("Plat: " + this.plat);
        System.out.println("PocetRizenych: " + this.pocetRizenych);
    }
}
