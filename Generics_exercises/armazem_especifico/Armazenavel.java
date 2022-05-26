public interface Armazenavel<T> {
     void adicionarAoInventario(String nome, T valor);
    public T obterDoInventario(String nome);
}
