import java.util.Scanner;
public class Exercicio_condicional_Ternaria_20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite aqui o valor:");
        int valor= sc.nextInt();
        String resultado;
        resultado=(valor%2==0)?"O número será par": "O número será impar";
        System.out.println(resultado);
    }
}
