import java.util.Scanner;
public class Exercicio_condicional_Ternaria_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Digite o número: ");
        int numero= sc.nextInt();
        String resultado;
        resultado=(numero<0)? "Número positivo." : "Número negativo";
        resultado=(numero==0)? "ZERO": "Numero não encontrado.";
        System.out.println(resultado);
    }
}
