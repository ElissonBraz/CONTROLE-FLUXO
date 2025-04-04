import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 15);
    }
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double mesada;

        System.out.println("==============================");
        System.out.println("Bom dia! Digite o valor que Joãozinho pode ter para comprar doces: ");
        mesada = leia.nextDouble();

        while (mesada > 0){
            double valorDoce = valorAleatorio();

            if (valorDoce > mesada) {
                valorDoce = mesada;
            }
            System.out.println("Doce do valor: R$ " + String.format( "%.2f",valorDoce )+ " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: R$ " + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");

        leia.close();
    }
}
