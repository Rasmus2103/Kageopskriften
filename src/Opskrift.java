public class Opskrift {
    private String type;
    private double amount;
    private int antal;
    private static Ingrediens[] ingrediens;
    private final static int numberPersons = 4;

    public Opskrift() {
        this.type = "Sandkage";

        Ingrediens smør = new Ingrediens("Smør", 250, "gram",7.17 );
        Ingrediens sukker = new Ingrediens("Sukker", 250, "gram", 3.87);
        Ingrediens æg = new Ingrediens("Æg", 4, "styks", 61, 155);
        Ingrediens mel = new Ingrediens("Hvedemel", 250, "gram", 3.64);
        Ingrediens vaniljeSukker = new Ingrediens("Vaniljesukker", 3, "tsk", 3.5, 3.81);
        Ingrediens bagepulver = new Ingrediens("Bagepulver", 1, "tsk", 5, 0.53);

        this.ingrediens = new Ingrediens[]{mel, bagepulver, sukker, æg, vaniljeSukker, smør};
    }

    public void setAntal(int antal) {
        this.antal = antal;
        for (Ingrediens ingrediens1: ingrediens) {
            ingrediens1.setAntal(antal);
        }
    }

    public void tilfoejIngredienser(Ingrediens[] ingrediens1) {
        this.ingrediens = ingrediens1;
    }

    public double getTotalEnergi() {
        double totalEnergi = 0;
        if (ingrediens != null)
        for (Ingrediens ingrediens1: ingrediens) {
            totalEnergi += ingrediens1.beregnEnergi(antal);
        }
        return totalEnergi;
    }

    public double getTotalWeight() {
        double totalWeight = 0;
        if (ingrediens != null)
        for (Ingrediens ingrediens1: ingrediens) {
            totalWeight += ingrediens1.beregnVægt(antal);
        }
        return totalWeight;
    }

    public double averageEnergy() {
        double energy = getTotalEnergi();
        return energy / antal;
    }

    public double averageWeight() {
        double weight = getTotalWeight();
        return weight / antal;
    }

    public String getNavn() {
        return type;
    }

    public Ingrediens[] getIngredienser() {
        return ingrediens;
    }

}