import atividades.Atividade;

public class MaquinaWorkflow {

    public void executar(Workflow workflow){
        for (Atividade atv: workflow.getAtividade()) {
            atv.executar();
        }
    }
}
