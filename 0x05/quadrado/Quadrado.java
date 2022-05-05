import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Quadrado extends Retangulo{

    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if(lado >=0 ){
            this.lado = lado;
            this.altura = lado;
            this.largura = lado;
        }else{
            throw new IllegalArgumentException("Lado deve ser maior ou igual a 0");
        }
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        return ("[Quadrado] " + decimalFormat.format(lado));
    }
}
