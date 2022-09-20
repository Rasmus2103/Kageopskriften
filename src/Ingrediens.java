public class Ingrediens {

    // Alle ingredienserne/attributerne
    private String type;
    private double amount;
    private String unit;
    private double weightPrUnit;
    private double energy;

    private double newAmountPersons;

    private double antal;

    private final static int numberPersons = 4;

    // Konstruktør
    public Ingrediens(String type, double amount, String unit, double energy) {
        this.type = type;
        this.amount = amount;
        this.unit = unit;
        this.energy = energy;
    }
    public Ingrediens(String type, double amount, String unit, double weightPrUnit, double energy) {
        this.type = type;
        this.amount = amount;
        this.unit = unit;
        this.weightPrUnit = weightPrUnit;
        this.energy = energy;
    }

    // get metode
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit() {
        this.unit = unit;
    }

    public double getWeightPrUnit() {
        return weightPrUnit;
    }

    public void setWeightPrUnit(double weightPrUnit) {
        this.weightPrUnit = weightPrUnit;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    public double getNewAmountPersons() {
        return newAmountPersons;
    }

    public void setNewAmountPersons(double newAmountPersons) {
        this.newAmountPersons = newAmountPersons;
    }

    public double getAntal() {
        return antal;
    }

    public void setAntal(int antal) {
        this.antal = antal;
    }

    double beregnMængde(double antal) {
        double beregnetMængde = amount / numberPersons * antal;
        return beregnetMængde;
    }

    double beregnEnergi (double antal) {
        double beregnetEnergi = energy / numberPersons * antal;
        return beregnetEnergi;
    }


    double beregnVægt (double antal) {
        double beregnetVægt = weightPrUnit / numberPersons * antal;
        return beregnetVægt;
    }

}