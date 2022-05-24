import java.util.*;

class PostByCategory implements Comparator<Post>{

    @Override
    public int compare(Post o1, Post o2) {
        return o1.getCategoria().compareTo(o2.getCategoria());
    }
}
public class Blog {

    private List<Post> posts;

    public Blog(){
        posts = new ArrayList<Post>();
    }
    public void adicionarPostagem(Post postagem){
        for (Post post: this.posts) {
            if(post.getAutor().equals(postagem.getAutor()) && post.getTitulo().equals(postagem.getTitulo())){
                throw new IllegalArgumentException("Postagem jah existente");
            }
        }
        posts.add(postagem);
    }

    public Set<Autor> obterTodosAutores(){
        Set<Autor> autores = new TreeSet<Autor>();
//        Collections.sort(this.posts);
        for (Post post: this.posts) {
            autores.add(post.getAutor());
        }
        return autores;
    }
    public Map<Categorias, Integer> obterContagemPorCategoria(){
        Map<Categorias, Integer> category = new TreeMap<Categorias, Integer>();
        Collections.sort(this.posts, new PostByCategory());
        for (Post post:this.posts) {
            if(category.containsKey(post.getCategoria())){
                category.put(post.getCategoria(), category.get(post.getCategoria())+1);
            }else{
                category.put(post.getCategoria(), 1);
            }
        }
        return category;
    }
    public Set<Post> obterPostsPorAutor(Autor autor){
        Set<Post> postsAutor = new TreeSet<Post>();
        Collections.sort(this.posts);
        for (Post post: this.posts) {
            if(post.getAutor().equals(autor)){
                postsAutor.add(post);
            }
        }
        return postsAutor;
    }

    public Set<Post>obterPostsPorCategoria(Categorias categoria){
        Set<Post> postsCategoria = new TreeSet<Post>();
        Collections.sort(this.posts);
        for (Post category: this.posts) {
            if(categoria.equals(category.getCategoria())){
                postsCategoria.add(category);
            }
        }
        return postsCategoria;
    }

   public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias(){
        ArrayList<Categorias> listaCategoria = new ArrayList<Categorias>();
        Set<Post> setPost = new TreeSet<Post>();
        Map<Categorias, Set<Post>> mapaPost = new TreeMap<Categorias, Set<Post>>();
        for (Post post: this.posts) {
           if(!listaCategoria.contains(post.getCategoria())){
               listaCategoria.add(post.getCategoria());
           }
       }
        Collections.sort(listaCategoria);
       for (Categorias lista: listaCategoria) {
           for (Post post: this.posts) {
               if(post.getCategoria().equals(lista)){
                   if(!mapaPost.containsKey(lista)){
                       setPost = new TreeSet<Post>();
                   }
                   setPost.add(post);
                   mapaPost.put(lista, setPost);
               }
           }
       }
        return mapaPost;
    }
    public Map<Autor, Set<Post>> obterTodosPostsPorAutor(){
        ArrayList<Autor> listaAutor = new ArrayList<Autor>();
        Set<Post> setPost = new TreeSet<Post>();
        Map<Autor, Set<Post>> mapaPost = new TreeMap<Autor, Set<Post>>();

        for (Post post: this.posts) {
            if(!listaAutor.contains(post.getAutor())){
                listaAutor.add(post.getAutor());
            }
        }

        Collections.sort(listaAutor);

        for (Autor listaAuthor: listaAutor) {
            for (Post post: this.posts) {
                if(post.getAutor().equals(listaAuthor)){
                    if(!mapaPost.containsKey(listaAuthor)){
                        setPost = new TreeSet<Post>();
                    }
                    setPost.add(post);
                    mapaPost.put(listaAuthor, setPost);
                }
            }
        }

        return mapaPost;
    }
}
