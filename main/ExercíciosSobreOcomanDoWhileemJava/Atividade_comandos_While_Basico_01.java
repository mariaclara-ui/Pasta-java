import java.util.Scanner;
public class Atividade_comandos_While_Basico_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;

        while (contador < 100) {
            System.out.println("Quantas peças foram produzidas?");
            int numero = sc.nextInt();
            contador += numero;
            System.out.println("Total de peças até agora: " + contador);
        }
        System.out.println("A quantidade de peças chegou ate 100.");
    }
}
