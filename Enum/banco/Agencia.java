import java.util.ArrayList;

public class Agencia {

    private String nome;
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();;

    public String getNome() {
        return nome;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public Agencia(String nomeAgencia){
        this.nome = nomeAgencia;
    }
    public boolean novoCliente(String nomeCliente, double valorTransacaoInicial){
        if(buscarCliente(nomeCliente) == null){
            this.clientes.add(new Cliente(nomeCliente, valorTransacaoInicial));
            return true;
        }else {
            return false;
        }
    }
    public Cliente buscarCliente(String nomeCliente){
        for (Cliente cliente: this.clientes) {
            if(cliente.getNome().equals(nomeCliente)){
                return cliente;
            }
        }
        return null;
    }
    public boolean adicionarTransacaoCliente(String nomeCliente, double valorTransacao){
        if(buscarCliente(nomeCliente)!= null){
            buscarCliente(nomeCliente).adicionarTransacao(valorTransacao);
            return true;
        }else{
            return false;
        }
    }
}
