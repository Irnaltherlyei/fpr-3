import Personal.Angestellter;
import Personal.Manager;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Personalabteilung pa = new Personalabteilung();

        pa.addEmployee(new Angestellter(105,"Freddy", new Date(), 2000));
        pa.addEmployee(new Angestellter(102,"Jan", new Date(), 1900));
        pa.addEmployee(new Angestellter(103,"José", new Date(), 1800));
        pa.addEmployee(new Angestellter(104,"Louis", new Date(), 1700));
        pa.addEmployee(new Manager(101,"Adrian", new Date(), 2500,1000));

        pa.print();

        System.out.println("Highetst paid: " + pa.getLowestPaid().toString());
        System.out.println("Lowest paid: " + pa.getHighestPaid().toString());

        pa.getHighestPaid().raise(2f);
        pa.removeEmployee(pa.getLowestPaid());
        pa.removeEmployee(pa.getLowestPaid());

        pa.print();

    }
}
