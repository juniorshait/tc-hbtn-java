import produtos.Livro;
import produtos.Produto;

public class Pedido {

    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(int percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal(){
        double total = 0;
        for (ItemPedido item : itens) {
            total = total + (item.getQuantidade() * item.getProduto().obterPrecoLiquido());
        }
        return (total - total * this.percentualDesconto/100);
    }

     public void apresentarResumoPedido(){
         System.out.println("------- RESUMO PEDIDO -------");
         double total = 0, totalProduto = 0;
         for (ItemPedido item : itens) {
             String tipoProduto = String.valueOf(item.getProduto().getClass());
             int pos = tipoProduto.indexOf(".");
             System.out.printf("Tipo: "+ tipoProduto.substring(pos+1)+"  Titulo: "+item.getProduto().getTitulo()+
                     "  Preco: %.2f  Quant: %d  Total: %.2f\n", item.getProduto().obterPrecoLiquido(),item.getQuantidade(),item.getQuantidade()*item.getProduto().obterPrecoLiquido());
             total = total + (item.getQuantidade() * item.getProduto().obterPrecoLiquido());
             totalProduto = totalProduto + item.getProduto().obterPrecoLiquido()*item.getQuantidade();
         }
         System.out.println("----------------------------");
         System.out.printf("DESCONTO: %.2f\n",total*this.percentualDesconto/100);
         System.out.printf("TOTAL PRODUTOS: %.2f\n",totalProduto);
         System.out.println("----------------------------");
         System.out.printf("TOTAL PEDIDO: %.2f\n",totalProduto - totalProduto * this.percentualDesconto/100);
         System.out.println("----------------------------");

    }
}
