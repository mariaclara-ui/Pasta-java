import java.util.Scanner;
public class Atividade_Modularizacao_Na_Criacao_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        String frase = sc.nextLine();

        String[] palavras = frase.split(" ");
        int contador = 0;
        int letras = 0;

        while (letras < palavras.length) {
            for (char letra : palavras[letras].toCharArray()) {
            }
            contador++;
            letras++;
        }
        System.out.println("A quantidade de palavras será:"+contador);
    }
}