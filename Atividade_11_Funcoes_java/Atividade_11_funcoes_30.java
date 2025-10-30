import java.util.Scanner;

public class Atividade_11_funcoes_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura do servidor:");
        int servidor = sc.nextInt();
        max(servidor);
        }

        public static int max(int temperatura) {
        if (temperatura > 80) {
            System.out.println("Desligar servidor — superaquecimento crítico!");
            return 1;
        } else if (temperatura > 60) {
            System.out.println("Ativar resfriamento extra — temperatura moderada.");
            return 2;
            } else {
            System.out.println("Temperatura normal — sistema estável.");
            return 3;
        }
    }
}
