import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Consulta {

    public static List<Produto> obterLivrosDoPedido(Pedido pedido) {
        return pedido.getProdutos()
                .stream()
                .filter(produto -> produto.getCategoria()==CategoriaProduto.LIVRO).collect(Collectors.toList());
    }

    public static Produto obterProdutoMaiorPreco(List<Produto> produtos) {
        return  produtos.stream()
                .sorted(Comparator.comparing(Produto::getPreco)
                        .reversed())
                .limit(1).collect(Collectors.toList()).get(0);
    }

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, double precoMinimo) {
        return produtos.stream().filter(produto -> produto.getPreco()>=precoMinimo).collect(Collectors.toList());
    }

    public static List<Pedido> obterPedidosComEletronicos(List<Pedido> pedido) {
        return pedido.stream().filter(pedido1 -> pedido1.getProdutos().stream().
                anyMatch(produto -> produto.getCategoria()
                        .equals(CategoriaProduto.ELETRONICO)))
                .collect(Collectors.toList());
    }

    public static List<Produto> aplicar15PorcentoDescontoEletronicos(List<Produto> produtos) {
        List<Produto> produtos1 = new ArrayList<>();
        for (Produto produto: produtos) {
            if(produto.getCategoria().equals(CategoriaProduto.ELETRONICO)){
                produto.setPreco(produto.getPreco() - produto.getPreco() * 0.15);
            }
            produtos1.add(produto);
        }
        return produtos1;
    }
}
