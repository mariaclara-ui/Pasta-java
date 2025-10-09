import java.util.Scanner;
public class Exercicio_condicional_Ternaria_05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite o número;");
        int numero=sc.nextInt();
        String resultado;
        resultado=(numero%2==0)? "O número e par":"O número e impar";
        System.out.println(resultado);

    }
}
