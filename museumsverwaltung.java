/**
 * Die Klasse museumsverwaltung dient der Verwaltung von Exponaten in einem Museum.
 * 
 * @author Fabian, Moritz, Joel
 * @version 0.1
 */
public class museumsverwaltung {
    private List<exponat> exponatList;

    /**
     * Konstruktor für die museumsverwaltung-Klasse. Initialisiert die Liste für Exponate.
     */
    public museumsverwaltung() {
        exponatList = new List<exponat>();
    }

    /**
     * Methode zum Ausleihen eines Exponats.
     *
     * @param name Der Name des Exponats, das ausgeliehen werden soll.
     */
    public void ausleihen(String name) {
        exponatList.toFirst();
        while (exponatList.hasAccess()) {
            if (exponatList.getContent().expoName.equals(name)) {
                exponatList.getContent().aendereAusgeliehen();
                System.out.print(name + " wurde ausgeliehen");
                return;
            } else {
                exponatList.next();
            }
        }
    }

    /**
     * Methode zum Ausstellen eines Exponats.
     *
     * @param name Der Name des Exponats, das ausgestellt werden soll.
     */
    public void ausstellen(String name) {
        exponatList.toFirst();
        while (exponatList.hasAccess()) {
            if (exponatList.getContent().gibName().equals(name)) {
                exponatList.getContent().aendereAusstellung();
                System.out.print(name + " wurde ausgestellt");
                return;
            } else {
                exponatList.next();
            }
        }
    }

    /**
     * Methode zum Einlagern eines Exponats.
     *
     * @param name Der Name des Exponats, das eingelagert werden soll.
     */
    public void einlagern(String name) {
        exponatList.toFirst();
        while (exponatList.hasAccess()) {
            if (exponatList.getContent().gibName().equals(name)) {
                exponatList.getContent().aendereLager();
                System.out.print(name + " wurde eingelagert");
                return;
            } else {
                exponatList.next();
            }
        }
    }

    /**
     * Methode zum Hinzufügen eines neuen Exponats.
     *
     * @param name Der Name des neuen Exponats.
     * @param typ  Der Typ des neuen Exponats.
     */
    public void addExponat(String name, String typ) {
        exponatList.append(new exponat(name, typ));
    }

    /**
     * Methode zum Zählen und Anzeigen der Anzahl von Exponaten in verschiedenen Orten.
     */
    public void zaehle() {
        int lager = 0;
        int ausgeliehen = 0;
        int ausstellung = 0;

        exponatList.toFirst();
        while (exponatList.hasAccess()) {
            if (exponatList.getContent().gibOrt() == 1) {
                ausstellung++;
            }

            if (exponatList.getContent().gibOrt() == 2) {
                lager++;
            }

            if (exponatList.getContent().gibOrt() == 3) {
                ausgeliehen++;
            }
            exponatList.next();
        }
        System.out.print("Lager: " + lager);
        System.out.print("Ausgeliehen: " + ausgeliehen);
        System.out.print("Ausstellung: " + ausstellung);
    }
}
