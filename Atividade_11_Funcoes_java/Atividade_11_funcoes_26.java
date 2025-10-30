import java.util.Scanner;

public class Atividade_11_funcoes_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nível de tinta disponível (0 a 100):");
        int pintura = sc.nextInt();

        max(pintura);
        }

        public static int max(int tinta) {
        if (tinta < 20) {
            System.out.println("Parar — nível de tinta muito baixo!");
            return 1;
        } else if (tinta <= 50) {
            System.out.println("Alerta — nível de tinta moderado.");
            return 2;
        } else {
            System.out.println("Continuar — nível de tinta adequado.");
            return 0;
        }
    }
}
