import java.util.ArrayList;

public class Celular {

    private ArrayList<Contato> contatos = new ArrayList<Contato>();

    public int obterPosicaoContato(String nome){
        for(int i = 0; i< this.contatos.size(); i++){
            if(contatos.get(i).getNome().equals(nome)){
                return i;
            }
        }
        return -1;
    }
    public void adicionarContato(Contato contato){
        if( obterPosicaoContato(contato.getNome())== -1){
            contatos.add(contato);
        }else{
            throw new IllegalArgumentException("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
        }
    }
    public void atualizarContato(Contato contatoAntigo, Contato novoContato){
        if(obterPosicaoContato(contatoAntigo.getNome()) == -1){
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");
        }
        if((obterPosicaoContato(novoContato.getNome()) != -1) && (obterPosicaoContato(novoContato.getNome())!=obterPosicaoContato(contatoAntigo.getNome()))){
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato jah existente com esse nome");
        }
        contatos.set(obterPosicaoContato(contatoAntigo.getNome()),novoContato);
    }
    public void removerContato(Contato contato){
        if(obterPosicaoContato(contato.getNome())== -1){
            throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
        }else{
            contatos.remove(obterPosicaoContato(contato.getNome()));
        }
    }
    public void listarContatos(){
        for(int i = 0; i < contatos.size(); i++){
            System.out.println(contatos.get(i).getNome()+" -> "+contatos.get(i).getNumeroTelefone()+" "+"("+contatos.get(i).getTipo()+")");
        }
    }
}
