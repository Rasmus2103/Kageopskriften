import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Her har du opskriften på Sandkage: \n");

        Opskrift opskrift = new Opskrift();
        System.out.println(opskrift.getNavn());

        System.out.println("Hvor mange personer skal Sandkagen laves til?");
        Scanner sc = new Scanner(System.in);
        int antal = sc.nextInt();

        //Udregning af antal
        opskrift.setAntal(antal);
        System.out.println(Colors.RED + "Til " + antal + " personer skal du bruge" + Colors.RESET);

        System.out.printf(Colors.BLUE + "%-20s %-10s %5s\n", "Navn", "Mængde", "Måleenhed" + Colors.RESET);
        for (Ingrediens ingrediens1: opskrift.getIngredienser()) {
            System.out.printf(Colors.GREEN + "%-20s %-10s %5s\n", ingrediens1.getType(), ingrediens1.beregnMængde(antal), ingrediens1.getUnit() + Colors.RESET);
        }

        //Udregning af Energi
        System.out.println(Colors.RED + "\nEnergien pr. ingrediens for " + antal + " personer" + Colors.RESET);

        for (Ingrediens ingrediens1: opskrift.getIngredienser()) {
            System.out.printf(Colors.GREEN + "%-20s %18s %s\n", ingrediens1.getType(), ingrediens1.beregnEnergi(antal), "kcal" + Colors.RESET);
        }

        //Total og gennemsnitlige energi
        System.out.printf(Colors.CYAN + "Den totale energi er: %.2f %s", opskrift.getTotalEnergi(), "kcal" + Colors.RESET);
        System.out.printf(Colors.PURPLE + "\nDen gennemsnitlige energi er: %.2f %s", opskrift.averageEnergy(), "kcal\n" + Colors.RESET);


        //Udregning af vægten
        System.out.println(Colors.RED + "\nVægten pr. ingrediens for " + antal + " personer" + Colors.RESET);

        System.out.printf(Colors.BLUE + "%-20s %18s\n", "Navn", "Vægten i gram" + Colors.RESET);
        for (Ingrediens ingrediens1: opskrift.getIngredienser()) {
            System.out.printf(Colors.GREEN + "%-20s %18s\n", ingrediens1.getType(), ingrediens1.beregnVægt(antal) + Colors.RESET);
        }

        //Totale og gennemsnitlige vægt
        System.out.println(Colors.CYAN + "Den totale vægt er: " + " " + opskrift.getTotalWeight() + " gram" + Colors.RESET);
        System.out.println((Colors.PURPLE + "Den gennemsnitlige vægt er: " + opskrift.averageWeight() + " gram" + Colors.RESET));

    }
}