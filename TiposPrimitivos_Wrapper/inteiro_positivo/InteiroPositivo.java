public class InteiroPositivo {
    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        if(valor <=0 ){
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }else {
            this.valor = valor;
        }
    }

    public InteiroPositivo(int valor){
        this.valor = valor;
    }

    public InteiroPositivo(String valor){
       try {
          int num = Integer.parseInt (valor);
           setValor(num);
       }catch (NumberFormatException e){
           throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
       }
    }

    public boolean ehPrimo(){
        for (int j = 2; j < this.valor; j++) {
            if (this.valor % j == 0){
                return false;
            }
        }
        if(this.valor == 1){
            return false;
        }else{
            return true;
        }

    }
}
