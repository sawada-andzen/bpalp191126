package classes;

public class Zamestnanec {
    private String jmeno;
    private double zakladniMzda;

    public Zamestnanec(String jmeno, double z_mzda) {
        this.jmeno = jmeno;
        this.zakladniMzda = z_mzda;
    }

    public String getJmeno() {
        return jmeno;
    }

    public double getZakladniMzda() {
        return zakladniMzda;
    }

    public double vypocitejMzdu() {
        return zakladniMzda;
    }

    public void vypisInformace() {
        System.out.println("Jmeno: " + jmeno);
        System.out.println("Mzda: " + vypocitejMzdu());
    }
}
