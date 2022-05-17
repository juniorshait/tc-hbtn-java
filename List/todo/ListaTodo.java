import java.util.ArrayList;
import java.util.List;

public class ListaTodo {

    private ArrayList<Tarefa> tarefas;
    public ListaTodo(){
        tarefas = new ArrayList<>();
    }
    public void adicionarTarefa(Tarefa tarefa){
        boolean existe = false;
        for(int i = 0; i< tarefas.size(); i++){
            if(tarefas.get(i).getIdentificador() == tarefa.getIdentificador()){
                existe = true;
            }
        }if(existe == true){
            throw new IllegalArgumentException("Tarefa com identificador "+tarefa.getIdentificador()+" ja existente na lista");
        }else{
            tarefas.add(tarefa);
        }
    }
    public boolean marcarTarefaFeita(int identificador){
        for(int i = 0; i< tarefas.size(); i++){
            if(identificador == tarefas.get(i).getIdentificador()){
                tarefas.get(i).setEstahFeita(true);
                return true;
            }
        }
        return false;
    }
    public boolean desfazerTarefa(int identificador){
        for(int i = 0; i< tarefas.size(); i++){
            if(identificador == tarefas.get(i).getIdentificador()){
                tarefas.get(i).setEstahFeita(false);
                return true;
            }
        }
        return false;
    }
    public void desfazerTodas(){
        for(int i = 0; i< tarefas.size(); i++){
        tarefas.get(i).setEstahFeita(false);
        }
    }
    public void fazerTodas(){
        for(int i = 0; i< tarefas.size(); i++){
            tarefas.get(i).setEstahFeita(true);
        }
    }
    public void listarTarefas(){
        for(int i = 0; i< tarefas.size(); i++){
            if(tarefas.get(i).isEstahFeita() == true){
                System.out.println("[X]  Id: "+tarefas.get(i).getIdentificador()+" - Descricao: "+tarefas.get(i).getDescricao());
            }else{
                System.out.println("[ ]  Id: "+tarefas.get(i).getIdentificador()+" - Descricao: "+tarefas.get(i).getDescricao());
            }
        }
    }
}
