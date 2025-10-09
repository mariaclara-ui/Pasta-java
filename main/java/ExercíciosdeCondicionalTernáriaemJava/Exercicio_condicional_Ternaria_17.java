import java.util.Scanner;

public class Exercicio_condicional_Ternaria_17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digte aqui a temperatura:");
        int temperatura= sc.nextInt();
        String resultado;
        resultado=(temperatura>=30)?"Calor":"Frio";
        System.out.println(resultado);
    }
}
