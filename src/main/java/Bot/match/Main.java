package Bot.match;

import java.io.IOException;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException{
        
        ArrayList<String> bea = Match.extrai("src/main/java/Bot/ratingsB.csv");
        ArrayList<String> carlos = Match.extrai("src/main/java/Bot/ratingsC.csv");
        ArrayList<String> helo = Match.extrai("src/main/java/Bot/ratingsH.csv");
        
        ArrayList<String> resultadoBC = Match.compara(bea, carlos);
        ArrayList<String> resultadoBH = Match.compara(bea, helo);
        ArrayList<String> resultadoCH = Match.compara(carlos, helo);
        
        /*for (String filme: resultadoBC)
            System.out.println(filme);*/

        System.out.println("\nBea e Carlos tem " + resultadoBC.size() + " filmes com a mesma avaliação!\n");
        
        /*for (String filme: resultadoBH)
            System.out.println(filme);*/

        System.out.println("\nBea e Helô tem " + resultadoBH.size() + " filmes com a mesma avaliação!\n");
        
        /*for (String filme: resultadoCH)
            System.out.println(filme);*/

        System.out.println("\nCarlos e Helô tem " + resultadoCH.size() + " filmes com a mesma avaliação!\n");
    }
}
