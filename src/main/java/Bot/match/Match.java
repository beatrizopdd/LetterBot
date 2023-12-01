package Bot.match;

import java.io.*;
import java.util.*;

public class Match {

    public static ArrayList<String> extrai(String nomeArquivo) throws FileNotFoundException, IOException {
        ArrayList<String> filmes = new ArrayList();
        
        FileReader arquivo = new FileReader(nomeArquivo);
        BufferedReader leitor = new BufferedReader(arquivo);
        
        String linha = leitor.readLine();
        while (linha != null) {
            String filme = leFilme(linha);
            if (!filmes.contains(filme))
                filmes.add(filme);
            linha = leitor.readLine();
        }
        
        // remove cabeçalho
        filmes.remove(0);
        
        leitor.close();
        
        return filmes;
    }
    
    public static String leFilme(String linha) {
        String[] particulas = linha.split(",");
        
        // data
        particulas[0] = "NULLNULLNULL"; 
        
        // link
        particulas[particulas.length - 2] = "NULLNULLNULL";
        
        String[] nomeAnoAvaliacao = new String[particulas.length-2];
        int i = 0;
        for (String particula: particulas)
            if (!particula.equals("NULLNULLNULL"))
                nomeAnoAvaliacao[i++] = particula;
        
        String filme = Arrays.toString(nomeAnoAvaliacao);
        
        return filme;
    }
    
    public static ArrayList<String> compara(ArrayList<String> usuario1, ArrayList<String> usuario2) {
        ArrayList<String> emComum = new ArrayList();
        ArrayList<String> menor;
        ArrayList<String> maior;
        
        if (usuario1.size() < usuario2.size()) {
            menor = usuario1;
            maior = usuario2;
        } else {
            menor = usuario2;
            maior = usuario1;
        }
        
        for (String filme: menor) {
            if (maior.contains(filme))
                emComum.add(filme);
        }
        
        return emComum;
    }
}
