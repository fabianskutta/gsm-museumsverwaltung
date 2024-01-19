/**
 * Die Klasse Exponat repräsentiert ein Ausstellungsstück mit verschiedenen Zuständen (Ausstellung, Lager, Ausgeliehen).
 * 
 * @author Moritz, Joel, Fabian
 * @version 19.01.2024
 */
public class exponat {

    // Die Parameter der Klasse
    private boolean ausgeliehen;
    private boolean ausstellung;
    private boolean lager;
    public String expoName;
    public String expoTyp;

    /**
     * Konstruktor für die Exponat-Klasse.
     * 
     * @param name Der Name des Exponats.
     * @param typ Der Typ des Exponats.
     */
    public exponat(String name, String typ) {
        expoName = name;
        expoTyp = typ;
        ausgeliehen = false;
        ausstellung = false;
        lager = false;
    }

    /**
     * Methode zur Änderung des Ausgeliehen-Zustands.
     */
    public void aendereAusgeliehen() {
        if (ausstellung) {
            System.out.print("Das Exponat wird derzeit ausgeliehen");
            return;
        }
        if (lager) {
            System.out.print("Das Exponat befindet sich derzeit im Lager");
            return;
        }
        ausgeliehen = !ausgeliehen;
    }

    /**
     * Methode zur Änderung des Ausstellungs-Zustands.
     */
    public void aendereAusstellung() {
        if (ausgeliehen) {
            System.out.print("Das Exponat wird derzeit ausgeliehen");
            return;
        }
        if (lager) {
            System.out.print("Das Exponat befindet sich derzeit im Lager");
            return;
        }
        ausstellung = !ausstellung;
    }

    /**
     * Methode zur Änderung des Lager-Zustands.
     */
    public void aendereLager() {
        if (ausgeliehen) {
            System.out.print("Das Exponat wird derzeit ausgeliehen");
            return;
        }
        if (ausstellung) {
            System.out.print("Das Exponat befindet sich derzeit im Lager");
            return;
        }
        lager = !lager;
    }

    /**
     * Methode zur Anzeige des aktuellen Orts des Exponats.
     */
    public void gibOrt() {
        if (ausstellung) {
            System.out.print("Das Exponat befindet sich in der Ausstellung");
        } else if (lager) {
            System.out.print("Das Exponat befindet sich im Lager");
        } else if (ausgeliehen) {
            System.out.print("Das Exponat ist derzeit ausgeliehen");
        }
    }
}
