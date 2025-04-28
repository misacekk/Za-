import firmapozice.Manager;
import firmapozice.Tester;
import firmapozice.Vyvojar;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager manager = new Manager("Pepa","Doubravka","Ekonomie",100000,6, LocalDate.of(2024, 6, 28));
        manager.vypisInfo();
        manager.pridatZamestnance();
        manager.vypoctiOdpracovaneDny();
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        Vyvojar vyvojar = new Vyvojar("Franta","Dobry","Ekonomie",80000,"AJ,ČJ,NĚ",LocalDate.of(2022, 6, 28));
        vyvojar.vypisInfo();
        vyvojar.vypoctiOdpracovaneDny();
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        Tester tester = new Tester("Honza","Dobrak","Ekonomie",90000,LocalDate.of(2023, 6, 28));
        tester.vypisInfo();
        tester.vypoctiOdpracovaneDny();

        for(int i=0; i<20; i++){
          tester.naselJsemNovouChybu();
        }

        tester.vypisInfo();
        tester.vypoctiOdpracovaneDny();
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("1=přidat managera, 2=přidat vývojáře, 3=přidat testera, 4=přidat zaměstnance");
        int pocetManageru=1;
        int pocetVyvojaru=1;
        int pocetTesteru=1;
        int pocetZamestnancu=1;
        int volba = sc.nextInt();
        switch (volba){
            case 1:
                System.out.println("Kolik?");
                int cislo1= sc.nextInt();
                System.out.println("Počet manageru teď: "+(pocetManageru+cislo1));
                pocetManageru=pocetManageru+cislo1;
            break;
            case 2:
                System.out.println("Kolik?");
                int cislo2= sc.nextInt();
                System.out.println("Počet vyvojaru teď: "+(pocetVyvojaru+cislo2));
                pocetVyvojaru=pocetVyvojaru+cislo2;
            break;
            case 3:
                System.out.println("Kolik?");
                int cislo3= sc.nextInt();
                System.out.println("Počet testeru teď: "+(pocetTesteru+cislo3));
                pocetTesteru=pocetTesteru+cislo3;
            break;
            case 4:
                System.out.println("Kolik?");
                int cislo4= sc.nextInt();
                System.out.println("Počet zaměstnanců teď: "+(pocetZamestnancu+cislo4));
                pocetZamestnancu=pocetZamestnancu+cislo4;
                break;
        }

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Počet Managerů "+pocetManageru);
        System.out.println("Počet Vyvojářů "+pocetVyvojaru);
        System.out.println("Počet Testerů "+pocetTesteru);
        System.out.println("Počet Zaměstnanců "+pocetZamestnancu);
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
System.out.println("Počet manažerů = "+pocetManageru);
System.out.println("Počet všech zaměstnanců = "+pocetManageru);

    }
}