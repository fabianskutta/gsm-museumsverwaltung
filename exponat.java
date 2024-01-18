
/**
 * Beschreiben Sie hier die Klasse exponat.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class exponat
{
    public boolean ausgeliehen;
    public boolean ausstellung;
    public boolean lager;

    public exponat(String name, String typ)
    {
        String expoName = name;
        String expoTyp = typ;
        ausgeliehen = false;
        ausstellung = false;
        lager = false;
    }

    public void aendereAusgeliehen(){
        if (ausgeliehen = false){
           ausgeliehen = true; 
        }
        else{
            ausgeliehen = false;
        }
    }

    public void aendereAusstellung(){
        if (ausstellung = false){
            ausstellung = true;
        }
        else{
            ausstellung = false;
        }
    }

    public void aendereLager(){
        if(lager = false){
            lager = true;
        }
        else{
            lager = false;
        }
    }
    
}
