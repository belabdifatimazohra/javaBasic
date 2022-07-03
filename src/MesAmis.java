import exo.Person;

public class MesAmis {
    public static void main(String[] args) {
        // Déclarer des objets personnes
        Person fz = new Person("BELABDI", "Fatima Zohra", 30);
        Person amal = new Person("BENSBA", "amal", 24);
        Person sab = new Person("CHAYEB", "sab", 29);
        Person amina = new Person("Chayeb","Amina");
        // Appel de la méthode presentezVous
        fz.presentezVous();
        amal.presentezVous();
        sab.presentezVous();
        // Appel de la méthode quelEstVotreNom
        String myName = fz.quelEstVotreNom();
        System.out.println(fz.quelEstVotreNom());
        System.out.println(fz.quelEstVotreAge());
        System.out.println(fz.getAge());
        amina.setAge(31);
        System.out.println(amina.getAge());
        System.out.println(fz.count);

    }
}

