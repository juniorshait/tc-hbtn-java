package produtos;

public class Dvd extends Produto {

  private String diretor;
  private String genero;
  private int duracao;

  public Dvd(String titulo, int ano, String pais, double precoBruto, String diretor, String genero, int duracao) {
    super();
    super.ano = ano;
    super.pais = pais;
    super.precoBruto = precoBruto;
    super.titulo = titulo;
    this.diretor = diretor;
    this.duracao = duracao;
    this.genero = genero;
  }

  @Override
  public double obterPrecoLiquido() {
    double acrescimo = this.precoBruto * 0.2;
    acrescimo = acrescimo + this.precoBruto;
    return acrescimo;
  }
}
