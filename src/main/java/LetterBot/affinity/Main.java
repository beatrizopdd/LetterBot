package LetterBot.affinity;

import java.io.IOException;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException{
        
        ArrayList<String> userA = Affinity.extrai("src/main/java/LetterBot/watchedA.csv");
        ArrayList<String> userB = Affinity.extrai("src/main/java/LetterBot/watchedB.csv");
        
        ArrayList<String> resultado = Affinity.compara(userA, userB);
        
        for (String filme: resultado)
            System.out.println(filme);

        System.out.println("\n" + resultado.size() + " filmes em comum");
        
    }
}
