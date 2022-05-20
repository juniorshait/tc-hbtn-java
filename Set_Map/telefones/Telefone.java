public class Telefone {
    private String codigoArea;
    private String numero;

    public Telefone(String codigoArea, String telefone){
        this.numero = telefone;
        this.codigoArea = codigoArea;
    }

    @Override
    public String toString(){
        return "("+this.codigoArea+") "+this.numero;
    }
}
