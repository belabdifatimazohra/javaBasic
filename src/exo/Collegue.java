package exo;

public class Collegue extends Person {
    private String fonction;

    public Collegue(String nom, String prenom, int age, String fonction) {
        //Appel du constructeur de la classe mère Person
        super(nom, prenom, age);
        this.fonction = fonction;

    }

    @Override
    public String presentezVous() {
        return super.presentezVous() + " " + fonction;
    }
}
/* HomeWork Ajouter deux attr + deux methodes dans les deux nouvelles classes,
 utiliser la même methode du parent presentezVous mais rajouter un autre truc à afficher
 */
