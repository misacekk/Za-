import firmapozice.Manager;
import firmapozice.Tester;
import firmapozice.Vyvojar;
import jdk.incubator.vector.VectorOperators;

public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager("Pepa","Doubravka","Ekonomie",100000);
        manager.vypisInfo();
        Vyvojar vyvojar = new Vyvojar("Franta","Doubravka","Ekonomie",80000);
        vyvojar.vypisInfo();
        Tester tester = new Tester("Honza","Doubravka","Ekonomie",90000);
        tester.vypisInfo();

    }
}