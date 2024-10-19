package tache01;

public class Restaurant {
    public static void main(String[] args) {


        //Création Plat

        Plat plat1 = new Plat("Steak frite", 18.7812, TypePlat.PRINCIPAL);
        Plat plat2 = new Plat("Salade césar", 7.2, TypePlat.ENTREE);
        Plat plat3 = new Plat("Tarte à la pomme", 3.50, TypePlat.DESSERT);

        //Création Boisson

        Boisson boisson1 = new Boisson("Coca-cola", 1.82,TypeBoisson.GAZEUSE);
        Boisson boisson2 = new Boisson("Thé",1.3,TypeBoisson.CHAUDE);



        // Création Menu
        Menu menu1 = new Menu("Menu du Jour");

        //Ajout Plat et Boisson au Menu
        menu1.ajouterProduit(plat1);
        menu1.ajouterProduit(plat2);
        menu1.ajouterProduit(plat3);
        menu1.ajouterProduit(boisson1);
        menu1.ajouterProduit(boisson2);


        //Affichage details et prix menus
        menu1.afficherDetailsMenu();

    }
}
