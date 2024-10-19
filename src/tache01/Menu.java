package tache01;

import java.util.ArrayList;
import java.util.List;

//Classe menu comme Composant
public class Menu {
    private String nomMenu;
    private List<Produit> produits = new ArrayList<>();


    public Menu(String nomMenu) {
        this.nomMenu = nomMenu;
    }

    public void ajouterProduit(Produit produit) {
        produits.add(produit);
    }





    public double afficherPrixMenu() {
        double totalprix = 0;
        for(Produit produit: produits){
            totalprix += produit.afficherPrixProduit();
        }
        return totalprix ;
    }


    public void afficherDetailsMenu() {
        System.out.println("----------------------------------------------------" );
        System.out.println(nomMenu);
        System.out.println("----------------------------------------------------" );
        for(Produit produit: produits){
            produit.afficherDetailsProduit();
        }
        System.out.println("----------------------------------------------------" );
System.out.println(afficherPrixMenu() +" CHF");
        System.out.println("----------------------------------------------------" );
    }
}
