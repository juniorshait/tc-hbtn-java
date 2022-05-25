import java.util.ArrayList;
import java.util.List;

public class Biblioteca<T> extends Midia{

    private List<T> listaGenerica;

    public Biblioteca(){
        this.listaGenerica = new ArrayList<T>();
    }
    public void adicionarMidia(T midia) {
        this.listaGenerica.add(midia);
    }

    public List<T> obterListaMidias() {
        return this.listaGenerica;
    }
}
