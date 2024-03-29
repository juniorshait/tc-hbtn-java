public class Comida {

    private String nome;
    private double calorias;
    private double preco;

    public Comida(String nome, int calorias, double preco) {
        this.calorias = calorias;
        this.preco = preco;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString(){
        return "["+this.nome+"]"+" "+String.format("%.6f",this.calorias)+" R$ "+String.format("%.6f",this.preco);
    }
}
