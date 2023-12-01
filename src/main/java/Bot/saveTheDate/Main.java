package Bot.saveTheDate;

import java.io.IOException;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException{
        
        ArrayList<String[]> bea = SaveTheDate.extrai("src/main/java/Bot/watchedB.csv");
        ArrayList<String[]> carlos = SaveTheDate.extrai("src/main/java/Bot/watchedC.csv");
        ArrayList<String[]> helo = SaveTheDate.extrai("src/main/java/Bot/watchedH.csv");
        
        // data no formato AAAA-MM-DD
        ArrayList<String> resultado = SaveTheDate.compara("2022-08-26", bea);
        
        System.out.println("\nNo dia 2022-08-26, o bea assistiu: ");
        if (resultado.isEmpty())
            System.out.println("NADA!");
        
        else
            for (String filme: resultado)
                System.out.println(filme);

        resultado = SaveTheDate.compara("2022-08-26", carlos);
        
        System.out.println("\nNo dia 2022-08-26, o carlos assistiu: ");
        if (resultado.isEmpty())
            System.out.println("NADA!");
        
        else
            for (String filme: resultado)
                System.out.println(filme);
        
        resultado = SaveTheDate.compara("2022-08-26", helo);
        
        System.out.println("\nNo dia 2022-08-26, o helo assistiu: ");
        if (resultado.isEmpty())
            System.out.println("NADA!");
        
        else
            for (String filme: resultado)
                System.out.println(filme);
        
    }
}
