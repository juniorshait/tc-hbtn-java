import java.util.*;
public class Blog {

    private List<Post> posts;

    public Blog(){
        posts = new ArrayList<Post>();
    }

    public void adicionarPostagem(Post postagem){
        posts.add(postagem);
    }

    public Set<String> obterTodosAutores(){
        Set<String> autores = new TreeSet<String>();
        Collections.sort(this.posts);
        for (Post autor: this.posts) {
            autores.add(autor.getAutor());
        }
        return autores;
    }
    public Map<String, Integer> obterContagemPorCategoria(){
        LinkedHashSet categoria = new LinkedHashSet<String>();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i< this.posts.size(); i++) {
            categoria.add(this.posts.get(i).getCategoria());
            list.add(posts.get(i).getCategoria());
        }
        Map<String, Integer> category = new HashMap<>();
        for (int i = 0; i<list.size(); i++){
            int quantidade = 0;
            for(int j = 0; j<posts.size(); j++){
                if(list.get(i).equals(posts.get(j).getCategoria())){
                    quantidade++;
                    category.put(list.get(i),quantidade);
                }
            }
        }
        Map<String, Integer> treeMap = new TreeMap<>(category);
        return treeMap;
    }
}
