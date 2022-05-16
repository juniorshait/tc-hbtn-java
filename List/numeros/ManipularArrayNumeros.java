import java.util.List;

public class ManipularArrayNumeros {

    public static int buscarPosicaoNumero(List<Integer> lista, int num){
       for(int i = 0; i < lista.size(); i++){
           if(lista.get(i).intValue() == num){
               return i;
           }
       }
        return -1;
    }
    public static void adicionarNumero(List<Integer> lista, int num){
        if(buscarPosicaoNumero(lista, num) == -1){
            lista.add(num);
        }else{
            System.out.println("Numero jah contido na lista");
        }
    }
    public static void removerNumero(List<Integer> lista, int num) {
        if(buscarPosicaoNumero(lista, num) == -1){
            System.out.println("Numero nao encontrado na lista");
        }else{
            lista.remove(buscarPosicaoNumero(lista, num));
        }
    }
    public static void substituirNumero(List<Integer> lista, int numeroSubstituir, int numeroSubstituto) {
        if (buscarPosicaoNumero(lista, numeroSubstituir) != -1){
            lista.set(buscarPosicaoNumero(lista, numeroSubstituir), numeroSubstituto);
        }else{
            lista.add(numeroSubstituto);
        }
    }
}
