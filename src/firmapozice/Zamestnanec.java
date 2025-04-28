package firmapozice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Zamestnanec {
    public String jmeno;
    public String prijmeni;
    public String pozice;
    public int plat;
    public LocalDate datumNastupu;

    public Zamestnanec(String jmeno, String prijmeni, String pozice, int plat, LocalDate datumNastupu) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.pozice = pozice;
        this.plat = plat;
        this.datumNastupu = datumNastupu;
    }

    public void vypisInfo(){
        System.out.println("Jmeno: " + this.jmeno);
        System.out.println("Prijmeni: " + this.prijmeni);
        System.out.println("Pozice: " + this.pozice);
        System.out.println("Plat: " + this.plat);
        System.out.println("Datum Nastupu: " + this.datumNastupu);
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public void setPozice(String pozice) {
        this.pozice = pozice;
    }

    public void setPlat(int plat) {
        this.plat = plat;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPozice() {
        return pozice;
    }

    public int getPlat() {
        return plat;
    }

    public LocalDate getDatumNastupu() {
        return datumNastupu;
    }

    public void vypoctiOdpracovaneDny(){
        long pocetDni = ChronoUnit.DAYS.between(this.datumNastupu, LocalDate.now());
        System.out.println("Odpracoval " + pocetDni + " dní.");
    }

}
