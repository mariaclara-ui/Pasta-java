import java.util.Scanner;
public class Exercicio_condicional_Ternaria_14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite a sua nota:");
        Double nota=sc.nextDouble();
        String resultado;
        resultado=(nota>7)? "Aprovado.": "Reprovado.";
        System.out.println(resultado);
    }
}
