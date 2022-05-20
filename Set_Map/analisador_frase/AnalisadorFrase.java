import java.util.*;

public class AnalisadorFrase {

    public static TreeMap contagemPalavras(String frase){
        String minuscula = frase.toLowerCase();
        minuscula = minuscula.replaceAll("\\p{Punct}", "");
        String[] palavras = minuscula.split(" ");
        Set<String> chaves = new HashSet<>(List.of(palavras));
        TreeMap<String, Integer> repete = new TreeMap<>();
        for (String chave: chaves) {
            repete.put(chave, Collections.frequency(List.of(palavras),chave));
        }
        return repete;
    }
}
