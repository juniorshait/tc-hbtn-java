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
        System.out.println("Codigo: "+this.codigo);
        System.out.println("Nome: "+this.nome);
        System.out.println("Bairro: "+this.endereco.getBairro());
        System.out.println("Cidade: "+this.endereco.getCidade());
        System.out.print("Pais: "+this.endereco.getPais());
    }
}
