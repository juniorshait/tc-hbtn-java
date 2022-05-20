import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class ListaTelefonica {

    private HashMap<String, HashSet<Telefone>> contatos;

    public ListaTelefonica(){
        this.contatos = new HashMap<>();
    }

    HashSet<Telefone> adicionarTelefone(String nome, Telefone telefone){
        HashSet<Telefone> contato;
        contato = contatos.get(nome);
        if(contato==null){
            contato = new HashSet<Telefone>();
        }
        if(contato.contains(telefone)){
            throw new IllegalArgumentException("Telefone jah existente para essa pessoa");
        }
        Iterator<HashSet<Telefone>> sahit = contatos.values().iterator();
        while (sahit.hasNext()){
            for(Telefone tel : sahit.next()){
                if(tel.equals(telefone)){
                    throw new IllegalArgumentException("Telefone jah pertence a outra pessoa");
                }
            }
        }

        contato.add(telefone);
        this.contatos.put(nome,contato);
        return contato;
    }
    HashSet<Telefone> buscar(String nome){
        for (String key : this.contatos.keySet()) {
           if(key.equals(nome)){
               return this.contatos.get(key);
           }
        }
        return null;
    }

}
