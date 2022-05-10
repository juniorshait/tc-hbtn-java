public class Video {
    private String arquivo;
    private FormatoVideo formato;

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }
    public FormatoVideo getFormato() {
        return formato;
    }
    public Video(String arquivo, FormatoVideo formato) {
        this.arquivo = arquivo;
        this.formato = formato;
    }
}
