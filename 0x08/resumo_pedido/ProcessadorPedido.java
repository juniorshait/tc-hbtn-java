import provedores.ProvedorFrete;
import provedores.Sedex;

public class ProcessadorPedido {
    private ProvedorFrete provedorFrete;

    public ProcessadorPedido(ProvedorFrete provedorFrete){
        this.provedorFrete = provedorFrete;
    }

    void processar(Pedido pedido){
        pedido.setFrete(this.provedorFrete.calcularFrete(pedido.getPeso(),pedido.getTotal()));
    }
}
