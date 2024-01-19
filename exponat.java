
/**
 * Beschreiben Sie hier die Klasse exponat.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class exponat {

    //Die verschiedenen Orte eines Exponats
    private boolean ausgeliehen;
    private boolean ausstellung;
    private boolean lager;
    public String expoName;
    public String expoTyp;

    //Exponat Klasse mit Konstruktor wird 
    public exponat(String name, String typ)
    {
        expoName = name;
        expoTyp = typ;
        ausgeliehen = false;
        ausstellung = false;
        lager = false;
    }

    public void aendereAusgeliehen(){
        if(ausstellung = true){
            System.out.print("Das Exponat wird derzeit ausgeliehen");
            return;
        }
        if(lager = true){
            System.out.print("Das Exponat befindet sich derzeit im Lager");
            return;
        }
        if (ausgeliehen = false){
           ausgeliehen = true; 
        }
        else{
            ausgeliehen = false;
        }
    }

    public void aendereAusstellung(){
        if(ausgeliehen = true){
            System.out.print("Das Exponat wird derzeit ausgeliehen");
            return;
        }
        if(lager = true){
            System.out.print("Das Exponat befindet sich derzeit im Lager");
            return;
        }
        if (ausstellung = false){
            ausstellung = true;
        }
        else{
            ausstellung = false;
        }
    }

    public void aendereLager(){
        if(ausgeliehen = true){
            System.out.print("Das Exponat wird derzeit ausgeliehen");
            return;
        }
        if(ausstellung = true){
            System.out.print("Das Exponat befindet sich derzeit im Lager");
            return;
        }
        if(lager = false){
            lager = true;
        }
        else{
            lager = false;
        }
    }

    public void gibOrt(){
        if(ausstellung = true){
            System.out.print("Das Exponat befindet sich in der Ausstellung");
            return;
        }
        if(lager = true){
            System.out.print("Das Exponat befindet sich im Lager");
            return;
        }
        if(ausgeliehen = true){
            System.out.print("Das Exponat ist derzeit ausgeliehen");
            return;
        }
    }

    public String gibName() {
        return this.name;
    }
    
}
