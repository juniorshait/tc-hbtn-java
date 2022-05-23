import java.util.Objects;

public class Post {
    private String autor;
    private String titulo;
    private String corpo;
    private String categoria;

    public Post(String autor, String titulo, String corpo, String categoria){
        this.autor = autor;
        this.titulo = titulo;
        this.categoria = categoria;
        this.corpo = corpo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.autor);
        hash = 31 * hash + Objects.hashCode(this.titulo);
        hash = 31 * hash + Objects.hashCode(this.categoria);
        hash = 31 * hash + Objects.hashCode(this.corpo);
        return hash;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCorpo() {
        return corpo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
