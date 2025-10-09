import java.util.Scanner;
public class Exercicio_condicional_Ternaria_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite a sua idade:");
        int idade=sc.nextInt();
        String resultado;
        resultado=(idade<16)? "Você não pode votar.": "Você pode votar.";
        System.out.println(resultado);
    }
}
