import atividades.Atividade;

import java.util.ArrayList;

public class Workflow {
    private ArrayList<Atividade> atividade = new ArrayList<>();
    public void registrarAtividade(Atividade atividade) {
        this.atividade.add(atividade);
    }

    public ArrayList<Atividade> getAtividade() {
        return atividade;
    }
}
