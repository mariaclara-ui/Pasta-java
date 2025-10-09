import java.util.Scanner;
public class Exercicio_condicional_Ternaria_08 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite a valor da idade:");
        int idade= sc.nextInt();
        if (idade<=12){
            System.out.println("Infantil.");
        }
        else if (idade<=18){
            System.out.println("Juvenil.");
        }
        else {
            System.out.println("Adulto.");
        }
    }
}
