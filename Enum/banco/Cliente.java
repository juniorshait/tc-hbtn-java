import java.util.ArrayList;

public class Cliente {
    private String nome;
    private ArrayList<Double> transacoes;

    public String getNome() {
        return nome;
    }

    public ArrayList<Double> getTransacoes() {
        return transacoes;
    }

    public Cliente(String nomeCliente, double transacaoInicial){
        this.nome = nomeCliente;
        this.transacoes = new ArrayList<Double>();
        adicionarTransacao(transacaoInicial);
    }
    public void adicionarTransacao(double valorTransacao){
        this.transacoes.add(valorTransacao);
    }
}
