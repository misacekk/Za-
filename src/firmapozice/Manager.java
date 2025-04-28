package firmapozice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Manager extends Zamestnanec {
    private int pocetRizenych;
    public Manager(String jmeno, String prijmeni, String pozice, int plat, int pocetRizenych, LocalDate datumNastupu) {
        super(jmeno, prijmeni, pozice, plat, datumNastupu);
        this.pocetRizenych = pocetRizenych;

    }
    public void vypisInfo(){
        System.out.println("Jmeno: " + this.jmeno);
        System.out.println("Prijmeni: " + this.prijmeni);
        System.out.println("Pozice: " + this.pozice);
        System.out.println("Plat: " + this.plat);
        System.out.println("PocetRizenych: " + this.pocetRizenych);
    }
    public void pridatZamestnance(){
        pocetRizenych++;
        System.out.println(pocetRizenych);
    }

    public void vypoctiOdpracovaneDny(){
        long pocetDni = ChronoUnit.DAYS.between(this.datumNastupu, LocalDate.now());
        System.out.println("Odpracoval " + pocetDni + " dní.");
    }

}
