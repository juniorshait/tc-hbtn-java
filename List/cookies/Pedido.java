import java.util.ArrayList;

public class Pedido {
    private ArrayList<PedidoCookie> cookies;
    public Pedido() {
        cookies = new ArrayList<>();
    }
    public void adicionarPedidoCookie(PedidoCookie pedido) {
        cookies.add(pedido);
    }
    public int removerSabor(String sabor) {
        int quantidadeRemovido =0;
        for(int i =0; i< cookies.size(); i++){
            if(cookies.get(i).getSabor().equals(sabor)){
                quantidadeRemovido+=cookies.get(i).getQuantidadeCaixas();
                cookies.remove(i);
            }
        }
        return quantidadeRemovido;
    }
    public int obterTotalCaixas() {
        int quantidadeCaixas =0;
        for(int i =0; i< cookies.size(); i++){
            quantidadeCaixas+=cookies.get(i).getQuantidadeCaixas();
        }
        return quantidadeCaixas;
    }
}
