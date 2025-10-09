import java.util.Scanner;
public class Exercicio_condicional_Ternaria_07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite seu salário:");
        double salario=sc.nextDouble();
        String resultado;
        resultado=(salario>=5.000)? "Seu salário terá o desconto de 20%" : "Seu salário terá o desconto de 10%";
        System.out.println(resultado);
    }
}
