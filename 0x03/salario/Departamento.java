public class Departamento {
    private double valorMeta;
    private double valorAtingidoMeta;

    public Departamento(double meta, double valorAtingido) {
        this.valorMeta = meta;
        this.valorAtingidoMeta = valorAtingido;
    }

    public void setValorMeta(double valorMeta){
        this.valorMeta = valorMeta;
    }
    public double getValorMeta(){
        return this.valorMeta;
    }
    public void setValorAtingidoMeta(double valorAtingidoMeta){
        this.valorAtingidoMeta = valorAtingidoMeta;
    }
    public double getValorAtingidoMeta(){
        return this.valorAtingidoMeta;
    }

    public boolean alcancouMeta(){
      return(valorMeta <= valorAtingidoMeta);
    }
}
