
/**
 * Beschreiben Sie hier die Klasse museumsverwaltung.
 * 
 * @author Fabian, Moritz, Joel
 * @version 0.1
 */
public class museumsverwaltung {
    private List<exponat> exponatList;

    public museumsverwaltung() {
        exponatList = new List<exponat>();
    }

    public void ausleihen (String name) {
        exponatList.toFirst();
        while (exponatList.hasAccess()) {
            if (exponatList.getContent().expoName == name) {
                exponatList.getContent().aendereAusgeliehen();
            } else {
                exponatList.next();
            }
        }
    }

    public void ausstellen (String name) {
        exponatList.toFirst();
        while (exponatList.hasAccess()) {
            if (exponatList.getContent().gibName() == name) {
                exponatList.getContent().aendereAusstellung();
            } else {
                exponatList.next();
            }
        }
    }

    public void einlagern (String name) {
        exponatList.toFirst();
        while (exponatList.hasAccess()) {
            if (exponatList.getContent().gibName() == name) {
                exponatList.getContent().aendereLager();
            } else {
                exponatList.next();
            }
        }
    }

    public void addExponat(String name, String typ) {
        exponatList.append(new exponat(name, typ));
    }
}
