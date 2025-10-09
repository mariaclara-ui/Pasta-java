import java.util.Scanner;

public class Exercicio_condicional_Ternaria_10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite o valor inicial:");
        int valor= sc.nextInt();
        String resultado;
        resultado=(valor%3==0)?"O numero é divisivel por tres": "O numero não é divisivel";
        System.out.println(resultado);
    }
}
