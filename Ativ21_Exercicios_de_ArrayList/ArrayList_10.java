package Ativ21_Exercicios_de_ArrayLis;

import java.util.Scanner;
import java.util.ArrayList;
public class ArrayList_10 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os e-mails separados por vírgula:");
        String linha = sc.nextLine();

        String[] partes = linha.split(",");


        ArrayList<String> emails = new ArrayList<>();

        for (String parte : partes) {
            String email = parte.trim().toLowerCase();

            if (!emails.contains(email)) {
                emails.add(email);
            } else {
                System.out.println("Duplicado ignorado: " + email);
            }
        }
        System.out.println("\nLista final de e-mails:");
        for (String e : emails) {
            System.out.println(e);
        }
    }
}



