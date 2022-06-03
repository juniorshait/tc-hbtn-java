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

    public static Map<String, Map<Integer, Long>> obterContagemPessoasPorCargoEIdade(List<Pessoa> pessoa) {
        return pessoa.stream().collect(groupingBy(Pessoa::getCargo, groupingBy(Pessoa::getIdade, Collectors.counting())));
    }

    public static Map<String, Double> obterMediaSalarioPorCargo(List<Pessoa> pessoa) {
        return pessoa.stream().collect(groupingBy(Pessoa::getCargo, Collectors.averagingDouble(Pessoa::getSalario)));
    }

    public static Map<String, TreeSet<String>> obterHobbiesPorCargo(List<Pessoa> todasPessoas) {
        return todasPessoas.stream().collect(groupingBy(Pessoa::getCargo, Collectors.flatMapping(pessoa -> pessoa.getHobbies().stream(),Collectors.toCollection(TreeSet::new))));
    }
}
