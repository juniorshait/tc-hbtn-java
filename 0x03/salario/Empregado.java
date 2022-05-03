public class Empregado {

    private double salarioFixo;

    public double getSalarioFixo(){
        return this.salarioFixo;
    }
    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double calcularSalarioTotal(Departamento departamento){
        return this.salarioFixo + calcularBonus(departamento);
    }

    public double calcularBonus(Departamento departamento) {
        double porcentagem = 0;
        if (departamento.alcancouMeta()) {
            porcentagem = this.salarioFixo * 0.1;
            return porcentagem;
        }else{
            return 0;
        }
    }
}
