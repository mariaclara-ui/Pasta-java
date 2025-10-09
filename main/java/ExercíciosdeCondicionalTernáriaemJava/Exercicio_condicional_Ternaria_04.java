import java.util.Scanner;

public class Exercicio_condicional_Ternaria_04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite o valor da temperatura em celsius:");
        double temperatura= sc.nextDouble();
        String resultado;
        resultado=(temperatura<=18)?"Frio": "Quente";
        System.out.println(resultado);
    }
}
