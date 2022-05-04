import exceptions.AutorInvalidoException;
import exceptions.LivroInvalidoException;
public class Livro {

    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco) throws LivroInvalidoException, AutorInvalidoException {
        Livro livro = new Livro();
        livro.setTitulo(titulo);
        livro.setAutor(autor);
        livro.setPreco(preco);
        this.titulo = livro.getTitulo();
        this.autor = livro.getAutor();
        this.preco = livro.getPreco();
    }

    public Livro() {
    }

    public void setAutor(String autor) throws AutorInvalidoException {
        if(autor != null && !autor.isEmpty() && new StringTokenizer(autor).countTokens() > 1){
            this.autor = autor;
        }
        else{
            throw new AutorInvalidoException("Nome de autor invalido");
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setPreco(double preco) throws LivroInvalidoException {
        if(preco > 0){
            this.preco = preco;
        }else{
            throw new LivroInvalidoException("Preco de livro invalido");
        }
    }
    public double getPreco() {
        return preco;
    }
    public void setTitulo(String titulo) throws LivroInvalidoException {
        if(titulo.length()  < 3){
            throw new LivroInvalidoException("Titulo de livro invalido");
        }
        else{
            this.titulo = titulo;
        }
    }
    public String getTitulo() {
        return titulo;
    }
}
