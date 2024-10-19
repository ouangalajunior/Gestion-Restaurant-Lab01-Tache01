package tache01;
//Feuille de composite Boisson

public class Boisson  implements  Produit{
    private String nomBoisson;
    private double prixBoisson;
    private TypeBoisson typeBoisson;

    public Boisson(String nomBoisson, double prixBoisson, TypeBoisson typeBoisson  ) {
        this.nomBoisson = nomBoisson;
        this.prixBoisson = prixBoisson;
        this.typeBoisson = typeBoisson;
    }


    @Override
    public double afficherPrixProduit() {
        return prixBoisson;
    }

    @Override
    public void afficherDetailsProduit() {
        System.out.println("Nom Boisson: " + nomBoisson+", prix boisson: " + prixBoisson + " CHF"+", type boisson: " + typeBoisson);


    }
}
