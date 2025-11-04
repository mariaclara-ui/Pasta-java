import java.util.Scanner;

public class Ativ20_For_Each_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[20];
        int count = 0;
        int opcao;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Cadastrar nomes");
            System.out.println("2 - Listar todos os nomes");
            System.out.println("3 - Listar nomes que começam com uma letra");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                if (count < nomes.length) {
                    System.out.println("Digite o nome:");
                    nomes[count] = sc.nextLine();
                    count++;
                    System.out.println("Nome cadastrado");
                } else {
                    System.out.println("Limite de cadastro atingido");
                }

            } else if (opcao == 2) {
                System.out.println("--- Lista de nomes ---");
                if (count == 0) {
                    System.out.println("Nenhum nome cadastrado.");
                } else {
                    for (String nome : nomes) {
                        if (nome != null) {
                            System.out.println(nome);
                        }
                    }
                }

            } else if (opcao == 3) {
                if (count == 0) {
                    System.out.println("Nenhum nome cadastrado ainda.");
                } else {
                    System.out.print("Digite a letra inicial: ");
                    String letra = sc.nextLine();
                }
            } else if (opcao == 0) {
                System.out.println("Encerrando o programa...");

            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        sc.close();
    }
}


