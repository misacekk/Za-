package firmapozice;

public class Zamestnanec {
    public String jmeno;
    public String prijmeni;
    public String pozice;
    public int plat;

    public Zamestnanec(String jmeno, String prijmeni, String pozice, int plat) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.pozice = pozice;
        this.plat = plat;
    }

    public void vypisInfo(){
        System.out.println("Jmeno: " + this.jmeno);
        System.out.println("Prijmeni: " + this.prijmeni);
        System.out.println("Pozice: " + this.pozice);
        System.out.println("Plat: " + this.plat);
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

}
