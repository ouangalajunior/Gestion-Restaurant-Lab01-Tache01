Laboratoire 1
Le but de tout le projet est d'implémenter une gestion de restaurant. Beaucoup de liberté sera prise
dans les règles et le fonctionnement, pour des raisons pédagogiques. Ne soyez pas choqués !!!!
Dans toutes les étapes du projet, garder une trace de chaque étape et de chaque labo. Ainsi, si des
modifications sont apportées au code pour une étape donnée, l'étape d'avant doit être versionnée et
possible à tester.
Ce 1er laboratoire vise à implémenter une partie simple permettant d’exploiter les 3 patrons de
conception déjà vus en cours : Fabrique, Fabrique Abstraite et Composite.
Tâche 1
Le restaurant offre trois types de produits :
• Les plats : nom, prix, type (entrée, principal, dessert)
• Les boissons : nom, prix, type (chaude, froide, gazeuse, alcoolisée)
• Les menus qui sont un regroupement de plats et de boissons. Souvent un plat de chaque
type plus une boisson ou deux.
Utiliser le patron de conception Composite pour modéliser cette situation et implémenter les classes
Plat, Boisson et Menu.
Implémenter une classe Restaurant (Main classe) permettant de gérer tous les produits dans un
restaurant. Cette classe permettra de tester les classes précédentes.
