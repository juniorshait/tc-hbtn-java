import exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {

    private String numeracao;
    private double saldo;
    private double taxaJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
        this.saldo = 0;
    }

    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    void depositar(double valor) throws OperacaoInvalidaException {
        if(valor > 0){
            this.saldo = this.saldo + valor;
        }else{
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
    }

    void sacar(double valor) throws OperacaoInvalidaException {
        if(valor <= 0){
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que 0");
        }else if(valor <= this.saldo){
            this.saldo = this.saldo - valor;
        }else{
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }
    }

    double calcularTarifaMensal(){
        double tarifa = 0;
        tarifa = this.saldo * 0.1;
        if(tarifa < 10){
            return tarifa;
        }else{
            return 10;
        }
    }

    double calcularJurosMensal(){
        if (getSaldo() > 0){
            return getSaldo() * ((getTaxaJurosAnual() / 12) / 100);
        } else {
            return 0;
        }
    }

    void aplicarAtualizacaoMensal(){
        this.saldo = (this.saldo + calcularJurosMensal() - calcularTarifaMensal());
    }

}
