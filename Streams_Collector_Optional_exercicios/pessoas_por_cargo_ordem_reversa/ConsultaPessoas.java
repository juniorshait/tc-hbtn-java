import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class ConsultaPessoas {

    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> todasPessoas) {
        return todasPessoas.stream().collect(groupingBy(Pessoa::getCargo, ()-> new TreeMap<>(Comparator.reverseOrder()),Collectors.toCollection(TreeSet::new)));
    }
}
