// PASSO 1: GENERAZIONE PERCORSO
import java.util.Random;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("La gara ha inizio!");
        System.out.println();
        String[] percorso = { "strada", "buca", "muro", "piscina" };
        
        System.out.println("Di quanti elementi deve essere composto il percorso?");
        int lunghezzaPercorso = sc.nextInt();        
       
        System.out.println("Percorso generato:");
        // Genero il percorso in maniera casuale in base all'input dell'utente
            for (int i = 0; i <lunghezzaPercorso; i++) {
                String ostacolo = percorso[r.nextInt(percorso.length)];
                System.out.print(ostacolo + " ");                
            }
        sc.close();         
    }
}
