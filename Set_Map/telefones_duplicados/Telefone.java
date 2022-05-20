import java.util.Objects;

public class Telefone {
    private String codigoArea;
    private String numero;

    public Telefone(String codigoArea, String telefone){
        this.numero = telefone;
        this.codigoArea = codigoArea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Telefone telefone = (Telefone) o;

        if (codigoArea != null ? !codigoArea.equals(telefone.codigoArea) : telefone.codigoArea != null) return false;
        return numero != null ? numero.equals(telefone.numero) : telefone.numero == null;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.codigoArea);
        hash = 31 * hash + Objects.hashCode(this.numero);
        return hash;
    }

    @Override
    public String toString(){
        return "("+this.codigoArea+") "+this.numero;
    }
}
