import java.util.ArrayList;
import java.util.List;

public class ConsultaProdutos {

    public static List<Produto> filtrar(List<Produto> produtos, CriterioFiltro criterioFiltro) {
        List<Produto> produtosTestados = new ArrayList<>();

        for (Produto product:produtos) {
            if(criterioFiltro.testar(product) == true){
                produtosTestados.add(product);
            }
        }
        return produtosTestados;
    }
}
