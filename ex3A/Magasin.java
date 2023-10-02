import java.util.HashMap;
import java.util.Map;

public abstract class Magasin {

    private Map<String,DVD> bac= new HashMap<String,DVD>();
    public void ajouter(String name, int anneeDeParution){
        DVD dvd=new DVD(name, anneeDeParution);
        bac.put(name,dvd);
    }
    public DVD retourneDVD(String name){
        return bac.get(name);
    }
}
