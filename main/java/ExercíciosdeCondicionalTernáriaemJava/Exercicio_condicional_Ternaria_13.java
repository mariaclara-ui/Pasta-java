import java.util.Scanner;
public class Exercicio_condicional_Ternaria_13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Digite o seu salário:");
        double salario= sc.nextDouble();
        String resultado;
        resultado=(salario>3.000) ? "Salário alto.":"Salário baixo.";
        System.out.println(resultado);
    }
}
