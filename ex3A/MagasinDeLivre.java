import java.util.HashMap;
import java.util.Map;

public class MagasinDeLivre extends Magasin {

	@Override
	protected Produit creerProduit(String name, int anneeDeParution) {
		return new Livre(name, anneeDeParution);
	}
}
