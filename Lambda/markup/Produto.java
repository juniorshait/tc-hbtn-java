import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {
    private String nome;
    private double preco;
    private double percentualMarkUp = 10;

    public Supplier<Double> precoComMarkUp = () -> this.preco + (this.preco*percentualMarkUp/100);
    public Consumer<Double> atualizarMarkUp = valor -> {
        this.percentualMarkUp = valor;
    };

    public Produto(double valor, String nome) {
        this.nome = nome;
        this.preco = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPercentualMarkUp() {
        return percentualMarkUp;
    }

    public void setPercentualMarkUp(double percentualMarkUp) {
        this.percentualMarkUp = percentualMarkUp;
    }

}
