import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Random r = new Random();

        System.out.println("La gara ha inizio!");
        
        String [] percorso = {"strada", "buca","muro", "piscina"};
        String [] azioni = {"corri","salta","arrampicati","nuota"};    
        int numeroCorridori = 5;

        ArrayList <String> azioniCorridori =  new ArrayList<>(numeroCorridori);


    }
}
