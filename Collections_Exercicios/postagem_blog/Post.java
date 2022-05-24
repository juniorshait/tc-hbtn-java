

public class Post implements Comparable<Post>{
    private Autor autor;
    private String titulo;
    private String corpo;
    private Categorias categoria;

    public Post(Autor autor, String titulo, String corpo, Categorias categoria){
        this.autor = autor;
        this.titulo = titulo;
        this.categoria = categoria;
        this.corpo = corpo;
    }

    public Autor getAutor() {
        return autor;
    }
    public Categorias getCategoria() {
        return categoria;
    }

    @Override
    public int compareTo(Post post) {
        return this.getTitulo().compareTo(post.getTitulo());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString(){
        return this.titulo;
    }
}
