package classes;

public class Manazer extends Zamestnanec {
    private double mesicniBonus;

    public Manazer(String jmeno, double mzda, double bonus) {
        super(jmeno, mzda);
        this.mesicniBonus = bonus;
    }

    @Override
    public double vypocitejMzdu() {
        double mzda = getZakladniMzda() + mesicniBonus;
        
        return mzda;
    }
}
