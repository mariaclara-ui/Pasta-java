import java.util.Scanner;

public class Exercicio_condicional_Ternaria_18 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite o valor inicial:");
        int valor1= sc.nextInt();
        System.out.println("Digite o valor final:");
        int valor2= sc.nextInt();
        String resultado;
        resultado=(valor1>valor2)?"O primeiro número e maior":"O segundo valor é menor";
        resultado=(valor1==valor2)?"Valores iguais":"Valor incompatível.";
        System.out.println(resultado);

    }
}
