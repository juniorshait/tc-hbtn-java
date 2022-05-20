import java.util.ArrayList;
import java.util.HashMap;

public class ListaTelefonica {

    private HashMap<String, ArrayList<Telefone>> contatos;

    public ListaTelefonica(){
        this.contatos = new HashMap<>();
    }

    void adicionarTelefone(String nome, Telefone telefone){
        if(buscar(nome) != null){
            this.contatos.get(nome).add(telefone);
        }else{
            ArrayList<Telefone> contato = new ArrayList<Telefone>();
            contato.add(telefone);
            this.contatos.put(nome, contato);
        }
    }

    ArrayList<Telefone> buscar(String nome){
        for (String key : this.contatos.keySet()) {
           if(key.equals(nome)){
               return this.contatos.get(key);
           }
        }
        return null;
    }

}
