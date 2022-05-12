public class Empregado {

   private String nome;
   private int codigo;
   private Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Empregado(String nome, int codigo, Endereco endereco){
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
    }

    public void apresentar(){
        System.out.println("Codigo: "+this.codigo+
                "\nNome: "+this.nome+
                "\nBairro: "+this.endereco.getBairro()+
                "\nCidade: "+this.endereco.getCidade()+
                "\nPais: "+this.endereco.getPais()
        );
    }
}
