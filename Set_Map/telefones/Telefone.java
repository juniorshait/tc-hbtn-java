public class Telefone {
    private String codigoArea;
    private String telefone;

    public Telefone(String codigoArea, String telefone){
        this.telefone = telefone;
        this.codigoArea = codigoArea;
    }

    @Override
    public String toString(){
        return "("+this.codigoArea+") "+this.telefone;
    }
}
