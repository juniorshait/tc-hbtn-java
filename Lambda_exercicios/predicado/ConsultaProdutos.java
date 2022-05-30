import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ConsultaProdutos {

    public static List<Produto> filtrar(List<Produto> produtos, Predicate<Produto> criterioFiltro) {
        List<Produto> produtosTestados = new ArrayList<>();
        for (Produto product:produtos) {
            if(criterioFiltro.test(product) == true){
                produtosTestados.add(product);
            }
        }
        return produtosTestados;
    }
}
