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
     * Ändert den Zustand des Exponats auf "ausgeliehen".
     * 
     * @return true, wenn der Zustand erfolgreich geändert wurde; false, wenn das Exponat bereits im Lager oder ausgestellt ist.
     */
    public void aendereAusgeliehen() {
        if (ausstellung) {
            System.out.print("Das Exponat wird derzeit ausgestellt");
            return;
        }
        if (lager) {
            System.out.print("Das Exponat befindet sich derzeit im Lager");
            return;
        }
        ausgeliehen = !ausgeliehen;
    }

    /**
     * Ändert den Zustand des Exponats auf "ausgestellt".
     * 
     * @return true, wenn der Zustand erfolgreich geändert wurde; false, wenn das Exponat bereits ausgeliehen oder im Lager ist.
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
     * Ändert den Zustand des Exponats auf "im Lager".
     * 
     * @return true, wenn der Zustand erfolgreich geändert wurde; false, wenn das Exponat bereits ausgeliehen oder ausgestellt ist.
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
     * Gibt den aktuellen Ort des Exponats zurück.
     * 
     * @return 1 für Ausstellung, 2 für Lager, 3 für ausgeliehen, -1 wenn der Ort nicht erkannt werden kann.
     */
    public int gibOrt() {
        if (ausstellung) {
            return 1;
        } else if (lager) {
            return 2;
        } else if (ausgeliehen) {
            return 3;
        } else {
            return -1;
        }
    }
    
    /**
     * Gibt den Namen des Exponats zurück.
     * 
     * @return Der Name des Exponats.
     */
    public String gibName() {
        return expoName;   
    }
}
