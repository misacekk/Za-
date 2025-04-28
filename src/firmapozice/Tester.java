package firmapozice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Tester extends Zamestnanec{
    private int pocetChyb;
    public Tester(String jmeno, String prijmeni, String pozice, int plat, LocalDate datumNastupu) {
        super(jmeno, prijmeni, pozice, plat, datumNastupu);
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

    public void vypoctiOdpracovaneDny(){
        long pocetDni = ChronoUnit.DAYS.between(this.datumNastupu, LocalDate.now());
        System.out.println("Odpracoval " + pocetDni + " dní.");
    }

}
