public class NumerosPares {
    public static void main(String[] args) {
            for(int i =0; i<100; i++) {
                if (i == 98) {
                    System.out.printf("%d\n", 98);
                } else if (i % 2 == 0) {
                    System.out.printf("%d%s", i, ", ");
                }
            }
        }
    }
