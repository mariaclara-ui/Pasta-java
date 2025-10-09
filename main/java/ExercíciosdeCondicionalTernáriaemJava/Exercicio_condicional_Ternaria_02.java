import java.util.Scanner;
public class Exercicio_condicional_Ternaria_02 {
    public static void main(String[]arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite o valor inicial:");
        int valor= sc.nextInt();
        String resultado;
        resultado=(valor<0)? "Valor negativo": "Valor positivo";
        System.out.println(resultado);
    }
}
