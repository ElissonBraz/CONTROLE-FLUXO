public class ExemploBreackContinue {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 5 ; numero ++) {
            if (numero == 3) {
                System.out.println("Você está lá!");
                continue;
            }
            System.out.println(numero);
        }
    }
}
