package LetterBot.saveTheDate;

import java.io.IOException;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException{
        
        ArrayList<String[]> userA = SaveTheDate.extrai("src/main/java/LetterBot/watchedA.csv");
        ArrayList<String[]> userB = SaveTheDate.extrai("src/main/java/LetterBot/watchedB.csv");
        
        // data no formato AAAA-MM-DD
        ArrayList<String> resultado = SaveTheDate.compara("2023-11-03", userA);
        
        System.out.println("\nNo dia 2023-11-03, o userA assistiu: ");
        if (resultado.isEmpty())
            System.out.println("NADA!");
        
        else
            for (String filme: resultado)
                System.out.println(filme);

        resultado = SaveTheDate.compara("2023-11-03", userB);
        
        System.out.println("\nNo dia 2023-11-03, o userB assistiu: ");
        if (resultado.isEmpty())
            System.out.println("NADA!");
        
        else
            for (String filme: resultado)
                System.out.println(filme);
        
        resultado = SaveTheDate.compara("2023-11-05", userB);
        
        System.out.println("\nNo dia 2023-11-05, o userB assistiu: ");
        if (resultado.isEmpty())
            System.out.println("NADA!");
        
        else
            for (String filme: resultado)
                System.out.println(filme);
        
    }
}
