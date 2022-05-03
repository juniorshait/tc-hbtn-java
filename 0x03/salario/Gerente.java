public class Gerente extends Empregado{

    private double salarioFixo;

    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    public double getSalarioFixo(){
        return super.getSalarioFixo();
    }

    @Override
    public double calcularBonus(Departamento departamento) {
        double porcentagem = 0;
        if (departamento.alcancouMeta()) {
            porcentagem = super.getSalarioFixo() * 0.2;
            double porcentagem1 = departamento.getValorAtingidoMeta() - departamento.getValorMeta();
            porcentagem1 = porcentagem1 * 0.01;
            porcentagem = porcentagem + porcentagem1;
        }
        return porcentagem;
    }
}
