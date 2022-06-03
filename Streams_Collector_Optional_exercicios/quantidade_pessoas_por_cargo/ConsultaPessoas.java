import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class ConsultaPessoas {

    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> todasPessoas) {
        return todasPessoas.stream().collect(groupingBy(Pessoa::getCargo, ()-> new TreeMap<>(Comparator.reverseOrder()),Collectors.toCollection(TreeSet::new)));
    }

    public static Map<String, Long> obterContagemPessoasPorCargo(List<Pessoa> todasPessoas) {
        return todasPessoas.stream().collect(groupingBy(Pessoa::getCargo, Collectors.counting()));
    }
}
