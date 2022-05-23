import java.util.Objects;

public class Post implements Comparable<Post>{
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

    public String getAutor() {
        return autor;
    }
    public String getCategoria() {
        return categoria;
    }
    @Override
    public int compareTo(Post post) {
        return this.getAutor().compareTo(post.getAutor());
    }
}
