import java.util.Scanner;

public class Atividade_11_funcoes_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nível de produção:");
        int producao = sc.nextInt();

        System.out.println("Digite o limite de parada:");
        int parar = sc.nextInt();

        max(producao, parar);
        }
        public static int max(int manutencao, int parar) {
        if (manutencao <= parar) {
                System.out.println("Erro crítico!");
                return 1;
        } else if (manutencao < parar + 10) { // Exemplo de faixa intermediária
                System.out.println("Erro moderado!");
                return 2;
        } else {
                System.out.println("Adicionar manutenção preventiva.");
                return 3;
        }
    }
}
