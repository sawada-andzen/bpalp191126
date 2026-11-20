package classes;

public class Brigadnik extends Zamestnanec {
    private int odpracovaneHodiny;

    public Brigadnik(String jmeno, double sazba, int hodiny) {
        super(jmeno, sazba);
        this.odpracovaneHodiny = hodiny;
    }

    @Override
    public double vypocitejMzdu() {
        double mzda = getZakladniMzda() * odpracovaneHodiny;

        return mzda;    
    }
}
