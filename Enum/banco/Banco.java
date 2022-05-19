import java.util.ArrayList;

public class Banco {

    private String nome;
    private ArrayList<Agencia> agencias;
    public Banco(String nomeBanco) {
        this.nome = nomeBanco;
        agencias = new ArrayList<Agencia>();
    }

   public Agencia buscarAgencia(String nomeAgencia){
       for (Agencia agencia:this.agencias) {
            if (agencia.getNome().equals(nomeAgencia)){
                return agencia;
            }
        }
       return null;
    }
    public boolean adicionarAgencia(String nomeAgencia){
        if(buscarAgencia(nomeAgencia) != null){
            return false;
        }else{
            this.agencias.add(new Agencia(nomeAgencia));
            return true;
        }
    }
    public boolean adicionarCliente(String nomeAgencia, String nomeCliente, double valorInicial){
        Agencia agencia =  buscarAgencia(nomeAgencia);
        if(agencia.buscarCliente(nomeCliente) == null){
            agencia.novoCliente(nomeCliente,valorInicial);
            adicionarAgencia(nomeAgencia);
            return true;
        }else{
            return false;
        }
    }
    public boolean adicionarTransacaoCliente(String nomeAgencia, String nomeCliente, double valor){
        Agencia agencia = buscarAgencia(nomeAgencia);
        if((agencia.buscarCliente(nomeCliente) != null) && (buscarAgencia(nomeAgencia) != null)) {
            return agencia.adicionarTransacaoCliente(nomeCliente, valor);
        }else{
            return false;
        }
    }
    public boolean listarClientes(String nomeAgencia, boolean imprime){
        Agencia agencia = buscarAgencia(nomeAgencia);
        if(agencia != null) {
            int posicao = 0;
            for (Cliente cliente : agencia.getClientes()) {
                posicao++;
                System.out.println("Cliente: " + cliente.getNome() + " [" + (posicao) + "]");
                if (imprime == true) {
                    int posicaoTransacao = 0;
                    for (double transacao : cliente.getTransacoes()) {
                        posicaoTransacao++;
                        System.out.println("  [" + posicaoTransacao + "] valor " + transacao);
                    }
                }
            }
            return true;
        }
        else{
            return false;
        }
    }
}
