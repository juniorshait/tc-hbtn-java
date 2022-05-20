import java.util.*;

public class AnalisadorFrase {

    public static TreeMap<String,Integer> contagemPalavras(String frase){
        String minuscula = frase.toLowerCase();
        minuscula = minuscula.replaceAll("[!.?]","");
        String[] palavras = minuscula.split(" ");
        TreeMap<String, Integer> repete = new TreeMap<>();
        for (String chave: palavras) {
            repete.put(chave, Collections.frequency(List.of(palavras),chave));
        }
        return repete;
    }
}
