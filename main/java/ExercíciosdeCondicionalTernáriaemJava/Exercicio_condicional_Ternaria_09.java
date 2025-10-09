import java.util.Scanner;
public class Exercicio_condicional_Ternaria_09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite o 1 número:");
        double numero1= sc.nextDouble();
        System.out.println("Digite o 2 número:");
        double numero2= sc.nextDouble();
        String resultado;
        resultado=(numero1<numero2)? "O primeiro número é menor" : "O segudo número é menor";
        System.out.println(resultado);
    }
}
