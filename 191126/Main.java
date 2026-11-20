import classes.*;

public class Main {
    public static void main(String[] args) {
        Firma firma = new Firma("Firma #1", 5);        

        firma.pridejZamestnance(new Zamestnanec("Peter", 1400.5));
        firma.pridejZamestnance(new Manazer("Matej", 1500.5, 500.1));
        firma.pridejZamestnance(new Brigadnik("Jiri", 160.0, 4));
        firma.pridejZamestnance(new Brigadnik("Max", 140.5, 7));

        firma.vypisZamestnance();
        firma.spocitejCelkoveMzdy();
        firma.najdiNejdrazsihoZamestnance();
    }
}
