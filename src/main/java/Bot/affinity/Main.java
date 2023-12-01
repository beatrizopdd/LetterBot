package Bot.affinity;

import java.io.IOException;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException{
        
        ArrayList<String> bea = Affinity.extrai("src/main/java/Bot/watchedB.csv");
        ArrayList<String> carlos = Affinity.extrai("src/main/java/Bot/watchedC.csv");
        ArrayList<String> helo = Affinity.extrai("src/main/java/Bot/watchedH.csv");
        
        ArrayList<String> resultadoBC = Affinity.compara(bea, carlos);
        ArrayList<String> resultadoBH = Affinity.compara(bea, helo);
        ArrayList<String> resultadoCH = Affinity.compara(carlos, helo);
        
        //for (String filme: resultadoBC)
            //System.out.println(filme);

        System.out.println("\nBea e Carlos tem " + resultadoBC.size() + " filmes em comum!\n");
        
        //for (String filme: resultadoBH)
            //System.out.println(filme);

        System.out.println("\nBea e Helo tem " + resultadoBH.size() + " filmes em comum!\n");
        
        //for (String filme: resultadoCH)
            //System.out.println(filme);

        System.out.println("\nCarlos e Helo tem " + resultadoCH.size() + " filmes em comum!\n");
    }
}
