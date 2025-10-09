import java.util.Scanner;

public class Exercicio_condicional_Ternaria_16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite o número:");
        int valor= sc.nextInt();
        String resultado;
        resultado=(valor%5==0)?"Não é multiplo de 5": "Multiplo";
        System.out.println(resultado);
    }
}
