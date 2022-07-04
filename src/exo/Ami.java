package exo;

public class Ami extends Person {

    private String lieuRencontre;

    public Ami(String nom, String prenom, int age, String lieuRencontre) {
        super(nom, prenom, age);
        this.lieuRencontre = lieuRencontre;
    }

    @Override
    public String presentezVous() {
        return super.presentezVous() + " " + lieuRencontre;
    }
}
