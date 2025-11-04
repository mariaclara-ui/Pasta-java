import java.util.Scanner;

public class Ativ20_For_Each_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite os itens no formato nome: Categoria separados por vírgulas:");
        String entrada = sc.nextLine();
        String[] itens = entrada.split(",");
        System.out.println("--- Todos os itens ---");
        for (String item : itens) {
            item = item.trim();
            String[] partes = item.split(":");
            if (partes.length == 2) {
                String nome = partes[0].trim();
                String categoria = partes[1].trim();
                System.out.println("Nome: " + nome + " | categoria: " +categoria);
            } else {
                System.out.println("Formato inválido: " + item);
            }
        }
    }
}

