public class Contato {
    private String nome;
    private String numeroTelefone;
    private TipoNumero tipo;

    public Contato(String nome, String numeroTelefone, TipoNumero tipo) {
        setNome(nome);
        setNumeroTelefone(numeroTelefone);
        setTipo(tipo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public TipoNumero getTipo() {
        return tipo;
    }

    public void setTipo(TipoNumero tipo) {
        this.tipo = tipo;
    }
}
