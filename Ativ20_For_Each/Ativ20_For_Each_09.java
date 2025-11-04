import java.util.Scanner;

public class Ativ20_For_Each_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os emails separados por vírgula:");
        String entrada = sc.nextLine();
        String[] emails = entrada.split(",");
        int contador=1;
        for (int i = 0; i < emails.length; i++) {
            emails[i] = emails[i].trim().toLowerCase();
        }
        System.out.println("n--- Todos os e-mails ---" +contador + entrada);
        contador++;
        for (String e : emails) {
            System.out.println(e);
        }
        System.out.println("--- E-mails únicos ---");
        String email= sc.nextLine();
        while (email.equals("sim")) {
            entrada = sc.nextLine();
            contador++;
        }
    }
}


