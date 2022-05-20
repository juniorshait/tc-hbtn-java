import java.util.HashSet;
import java.util.TreeSet;

public class NumerosDuplicados {

    static TreeSet<Integer> buscar(int[] numeros){
        HashSet<Integer> num = new HashSet<Integer>();
        TreeSet<Integer> num2 = new TreeSet<Integer>();
        for (int n :numeros) {
            if(!num.add(n)){
                num2.add(n);
            }
        }
        return num2;
    }
}
