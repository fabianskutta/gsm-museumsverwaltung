
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
        while (exponatList.hasAccess) {
            if (exponatList.getContent().name == name) {
                exponatList.getContent().aendereAusgeliehen();
            } else {
                exponatList.next();
            }
        }
        
    }

    public void ausstellen (exponat name) {
        name.aendereAusstellung();
    }

    public void einlagern (exponat name) {
        name.aendereLager();
    }

    public void addExponat(String name, String typ) {
        exponatList.append(new exponat(name, typ));
    }
}
