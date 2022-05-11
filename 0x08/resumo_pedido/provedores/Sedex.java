package provedores;

public class Sedex implements ProvedorFrete{
    @Override
    public Frete calcularFrete(double peso, double valor) {
        double valorFrete = 0;

        if(peso > 1000){
            valorFrete = 0.1 * valor;
        }else{
            valorFrete = 0.05 * valor;
        }
        Frete frete = new Frete(obterTipoProvedorFrete(), valorFrete);
        return frete;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.SEDEX;
    }
}
