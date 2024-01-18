
/**
 * Beschreiben Sie hier die Klasse museumsverwaltung.
 * 
 * @author Fabian, Moritz, Joel
 * @version 0.1
 */
public class museumsverwaltung {
    private List exponate;

    public museumsverwaltung() {
        List<exponat> exponate = new List<exponat>();
    }

    public void ausleihen (Exponat name) {
        name.aendereAusgeliehen();
    }

    public void ausstellen (Exponat name) {
        name.aendereAusstellung();
    }

    public void einlagern (Exponat name) {
        name.aendereLager();
    }
}
