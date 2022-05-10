public class Mensagem {

    private String texto;
    private TipoMensagem tipoMensagem;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Mensagem(String texto, TipoMensagem tipoMensagem){
        this.texto = texto;
        this.tipoMensagem = tipoMensagem;
    }
    public TipoMensagem getTipoMensagem() {
        return tipoMensagem;
    }
}
