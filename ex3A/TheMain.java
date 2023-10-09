public class TheMain {
    public static void main(String[] args) {
        Magasin magasinDVD = new MagasinDeDVD();
        magasinDVD.creerProduit("Fnac" , 2000);
        magasinDVD.creerProduit("Kreffel" , 2000);

        Magasin magasinLivre = new MagasinDeLivre();
        magasinLivre.creerProduit("Livre", 2000);
        magasinLivre.creerProduit("Livre", 2000);
    }
}
