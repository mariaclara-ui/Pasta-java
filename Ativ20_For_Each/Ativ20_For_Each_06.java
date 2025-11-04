package Ativ20_For_Each;

import java.util.Scanner;

public class Ativ20_For_Each_06 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a frase desejada:");
        String frase = sc.nextLine();


        String[] vet = frase.split("\\s+");

        for (String palavra : vet) {
            String novaString = palavra.replaceAll("[.,;!?]", "");
            System.out.println(novaString);
        }
    }
}

