package exo;

public class Person {
    // Déclaration des attribus
    private String nom, prenom;
    private int age;
    public static int count = 0;
    // Bloc static,
    static {
            System.out.println("Je te présente mon premier ami! " );
    }

    // Constructeur de la classe
     public Person(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.count++;
    }


    public Person(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.count++;
    }
    // Getter
    public String getNom() {
        return nom;
    }
    // Setter
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }
    // Setter
    public void setAge(int age) {
        this.age = age;
    }

    // Methodes
    public void presentezVous(){
        System.out.println("Nom: " + this.nom + " - Prénom: " + this.prenom + " - Age:" + this.age );
    }
    // Méthode quelEstVotreNom(), qui permet   de connaître le nom de la personne concernée
    public String quelEstVotreNom(){
         return this.nom;
    }
    public int quelEstVotreAge(){
         return  this.age;
    }
}
