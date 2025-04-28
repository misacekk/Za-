package firmapozice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Vyvojar extends Zamestnanec{
    private String seznamJazyku;
    public Vyvojar(String jmeno, String prijmeni, String pozice, int plat, String seznamJazyku, LocalDate datumNastupu) {
        super(jmeno, prijmeni, pozice, plat, datumNastupu);
        this.seznamJazyku = seznamJazyku;
    }
    public void vypisInfo(){
        System.out.println("Jmeno: " + this.jmeno);
        System.out.println("Prijmeni: " + this.prijmeni);
        System.out.println("Pozice: " + this.pozice);
        System.out.println("Plat: " + this.plat);
        System.out.println("SeznamJazyku: " + this.seznamJazyku);
    }

    public void vypoctiOdpracovaneDny(){
        long pocetDni = ChronoUnit.DAYS.between(this.datumNastupu, LocalDate.now());
        System.out.println("Odpracoval " + pocetDni + " dní.");
    }

}
