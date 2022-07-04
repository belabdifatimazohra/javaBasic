import exo.Collegue;
import exo.Person;

// Java program to demonstrate BufferedReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MesAmis {
    public static void main(String[] args) throws IOException {

        // Déclarer des objets personnes
        Person fz = new Person("BELABDI", "Fatima Zohra", 30);
        Person amal = new Person("BENSBA", "amal", 24);
        Person sab = new Person("CHAYEB", "sab", 29);
        Person amina = new Person("Chayeb", "Amina");
        Collegue lili = new Collegue("lili", "lili", 5, "Enfant");
        /*Collegue lili1 = new Person("lili","lili",5); // Faux */
        Person lili2 = new Collegue("lili", "lili", 5, "Enfant");
        // Appel de la méthode presentezVous
        fz.presentezVous();
        amal.presentezVous();
        sab.presentezVous();
        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Veulliez saisir le nom!");
        // Reading data using readLine
        String name = reader.readLine();
        System.out.println("**********" + name);

        // Printing the read line
        System.out.println(name);
        // Appel de la méthode quelEstVotreNom
        String myName = fz.quelEstVotreNom();
        System.out.println(fz.quelEstVotreNom());
        System.out.println(fz.quelEstVotreAge());
        System.out.println(fz.getAge());
        amina.setAge(31);
        System.out.println(amina.getAge());
        System.out.println(fz.count);
        System.out.println(lili2.presentezVous());

    }
}

