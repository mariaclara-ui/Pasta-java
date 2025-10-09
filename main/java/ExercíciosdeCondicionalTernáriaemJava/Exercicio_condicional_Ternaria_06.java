import java.util.Scanner;

public class Exercicio_condicional_Ternaria_06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite o valor da nota:");
        int nota= sc.nextInt();
        String resultado;
        resultado=(nota>=7)?"Aprovado": "Reprovado";
        System.out.println(resultado);


    }
}
