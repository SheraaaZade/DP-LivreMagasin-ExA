import java.util.HashMap;
import java.util.Map;

public abstract class Magasin {

    private Map<String,Produit> bac= new HashMap<String,Produit>();
    public void ajouter(String name, int anneeDeParution){
        Produit produit=this.creerProduit(name, anneeDeParution);
        bac.put(name,produit);
    }

    protected abstract Produit creerProduit(String name, int anneeDeParution);
    public Produit retourneProduit(String name){
        return bac.get(name);
    }

}
