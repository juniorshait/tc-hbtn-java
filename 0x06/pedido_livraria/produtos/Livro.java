package produtos;

public class Livro extends Produto {

    private int paginas;
    private String autor;
    private int edicao;

    public Livro(String titulo, int ano, String pais, double precoBruto, int paginas, String autor, int edicao) {
        super(titulo,ano, pais, precoBruto);
        this.autor = autor;
        this.edicao = edicao;
        this.paginas = paginas;
    }

    @Override
    public double obterPrecoLiquido(){
        double acrescimo = this.precoBruto * 0.15;
        acrescimo = acrescimo + this.precoBruto;
        return acrescimo;
    }
}
