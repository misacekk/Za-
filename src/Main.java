import firmapozice.Manager;
import firmapozice.Tester;
import firmapozice.Vyvojar;

public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager("Pepa","Doubravka","Ekonomie",100000,6);
        manager.vypisInfo();
        Vyvojar vyvojar = new Vyvojar("Franta","Doubravka","Ekonomie",80000,"AJ,ČJ,NĚ");
        vyvojar.vypisInfo();
        Tester tester = new Tester("Honza","Doubravka","Ekonomie",90000);
        tester.vypisInfo();

        for(int i=0; i<20; i++){
          tester.naselJsemNovouChybu();
        }

        tester.vypisInfo();

    }
}