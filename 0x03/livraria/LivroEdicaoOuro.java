public class LivroEdicaoOuro extends Livro{

    public LivroEdicaoOuro(String titulo, String autor, double preco) throws AutorInvalidoException, LivroInvalidoException {
        super(titulo,autor,preco);
        super.setAutor(autor);
        super.setPreco(preco);
        super.setTitulo(titulo);
    }

    @Override
    public double getPreco() {
        double porcentagem = super.getPreco() * 0.3;
        porcentagem = porcentagem +super.getPreco();
        return porcentagem;
    }
}
