package LetterBot.saveTheDate;

import java.io.*;
import java.util.*;

public class SaveTheDate {

    public static ArrayList<String[]> extrai(String nomeArquivo) throws FileNotFoundException, IOException {
        
        ArrayList<String[]> filmes = new ArrayList();
        
        FileReader arquivo = new FileReader(nomeArquivo);
        BufferedReader leitor = new BufferedReader(arquivo);
        
        String linha = leitor.readLine();
        while (linha != null) {
            String[] filme = leFilme(linha);
            if (!filmes.contains(filme[1]))
                filmes.add(filme);
            linha = leitor.readLine();
        }
        
        // remove cabeçalho
        filmes.remove(0);
        
        return filmes;
    }
    
    public static String[] leFilme(String linha) {
        
        String[] filme = new String[2];
        
        String[] particulas = linha.split(",");
        
        // data
        filme[0] = particulas[0];
        particulas[0] = "NULLNULLNULL";
        
        // ano 
        particulas[particulas.length - 2] = "NULLNULLNULL";
        
        // url
        particulas[particulas.length - 1] = "NULLNULLNULL";
        
        String[] nome = new String[particulas.length-3];
        int i = 0;
        for (String particula: particulas) {
            if (!particula.equals("NULLNULLNULL"))
                nome[i++] = particula;
        }
        
        filme[1] = Arrays.toString(nome);
        
        return filme;
    }
    
    public static ArrayList<String> compara(String data, ArrayList<String[]> usuario) {

        ArrayList<String> noDia = new ArrayList();
                
        for (String[] filme: usuario) {
            if (filme[0].equals(data))
                noDia.add(filme[1]);
        }
        
        return noDia;
    }
}
