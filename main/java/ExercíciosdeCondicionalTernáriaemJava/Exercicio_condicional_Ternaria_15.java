import java.util.Scanner;

public class Exercicio_condicional_Ternaria_15 {public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Digite sua idade:");
    int idade= sc.nextInt();
    String resultado;
    resultado=(idade<=16)?"Não pode votar": "Pode votar";
    System.out.println(resultado);
}
}


