import java.util.Scanner;

public class Atividade_Sequencia_08_Dificil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("=== CONVERSOR BINÁRIO ⇄ DECIMAL ===");
            System.out.println("1 - Converter Decimal para Binário");
            System.out.println("2 - Converter Binário para Decimal");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao=0;
            opcao = sc.nextInt();
            if (opcao == 1) {
                System.out.print("Digite um número decimal: ");
                int decimal = sc.nextInt();
                System.out.print("Binário: ");
            } else if (opcao == 2) {
                System.out.print("Digite um número binário: ");
                String binario = sc.next();
                System.out.println("Decimal: " + opcao);
            } else if (opcao != 0) {
                System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
        }
    }