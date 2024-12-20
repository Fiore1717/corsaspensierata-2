
// PASSO 2 AGGIORNATO
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("La gara ha inizio!");
        System.out.println();
        String[] percorso = { "strada", "buca", "muro", "piscina" };
        String[] azioni = { "corri", "salta", "arrampicati", "nuota" };

        System.out.println("Di quanti elementi deve essere composto il percorso?");
        int lunghezzaPercorso = sc.nextInt();

        System.out.println("Percorso generato:");
        // Genero il percorso in maniera casuale in base all'input dell'utente
        ArrayList<String>ostacolo = new ArrayList<>();
        for (int i=0; i<lunghezzaPercorso; i++) {    
        ostacolo.add(percorso[r.nextInt(percorso.length)]);        
        }
        for (int i=0; i<ostacolo.size();i++) {
         System.out.print(ostacolo.get(i) + " ");
        }

        System.out.println();
        int numeroCorridori = 5;
        int turno = 1;
        boolean tuttiArrivati = false;

        while (!tuttiArrivati) {
            System.out.println("Turno n° : " + (turno++));
            for (int i=0; i<numeroCorridori; i++) {
            String azioneScelta = azioni[r.nextInt(azioni.length)];
            System.out.println("corridore n°" + (i+1) + " : " +azioneScelta);
            }
            tuttiArrivati = true;
        }

        sc.close();

    }
}
