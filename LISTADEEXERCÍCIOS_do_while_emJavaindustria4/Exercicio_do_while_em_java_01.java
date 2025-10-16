import java.util.Scanner;
public class Exercicio_do_while_em_java_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double temperatura;
        int contador=0;
        do {
            System.out.println("Digite a temperatura do forno:");//O forno industrial e um equipamento progetado para operar
            temperatura= sc.nextDouble();
        }while (temperatura<800 || temperatura>1200);
        System.out.println("Temperatura valida.");
    }

}
