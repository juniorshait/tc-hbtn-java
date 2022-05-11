package provedores;

public class Loggi implements ProvedorFrete{
    @Override
    public Frete calcularFrete(double peso, double valor) {
        double valorFrete = 0;

        if(peso > 5000){
            valorFrete = 0.12 * valor;
        }else{
            valorFrete = 0.04 * valor;
        }
        Frete frete = new Frete(obterTipoProvedorFrete(), valorFrete);
        return frete;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.LOGGI;
    }
}
