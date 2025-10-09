import java.util.Scanner;

public class Exercicio_condicional_Ternaria_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a idade:");
        int idade = sc.nextInt();
        String resultado;
        resultado = (idade >= 18) ? "Menor de idade" : "Maior de idade";
        System.out.println(resultado);
    }
}