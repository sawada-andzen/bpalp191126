package classes;

public class Firma {
    private String nazev;
    private Zamestnanec[] zamestnanci;
    private int pocetZamestnancu;

    public Firma(String nazev, int kapacita) {
        this.nazev = nazev;
        this.pocetZamestnancu = kapacita;
        this.zamestnanci = new Zamestnanec[kapacita];
    }

    public boolean pridejZamestnance(Zamestnanec zamestnanec) {
        boolean pridano = false;
        
        for (int i = 0; i < pocetZamestnancu; i++) {
            if (!pridano) {
                if (zamestnanci[i] == null) {
                    zamestnanci[i] = zamestnanec;
                    pridano = true;
                }
            }
        }

        return pridano;
    }

    public void vypisZamestnance() {
        for (int i = 0; i < pocetZamestnancu; i++) {
            if (zamestnanci[i] != null) {
                System.out.println("Zamestnanec #" + (i + 1));
                zamestnanci[i].vypisInformace();
            }
        }
    }

    public double spocitejCelkoveMzdy() {
        double soucet = 0;
    
        for (int i = 0; i < pocetZamestnancu; i++) {
            if (zamestnanci[i] != null) {
                soucet += zamestnanci[i].vypocitejMzdu();
            }
        }

        return soucet;
    }

    public void najdiNejdrazsihoZamestnance() {
        double max_mzda = 0;
        int index_nejdrazsiho = 0;

        for (int i = 0; i < pocetZamestnancu; i++) {
            if (zamestnanci[i] != null) {
                if (max_mzda < zamestnanci[i].vypocitejMzdu()) {
                    max_mzda = zamestnanci[i].vypocitejMzdu();
                    index_nejdrazsiho = i;
                }
            }
        }

        if (max_mzda > 0) {
            System.out.println("Nejdrazsi zamstnanec:");
            zamestnanci[index_nejdrazsiho].vypisInformace();
        }
        else {
            System.out.println("Firma je prazdna");
        }
    }
}
