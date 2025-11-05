import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite os valores desejados:");
        ArrayList<Double>valores=new ArrayList<>();
        double soma=0;
        double media=0;
        int contador=0;
        double valor;
        do {
            valor = sc.nextDouble();
            if (valor!=0) {
                contador++;
                valores.add(valor);
                System.out.printf("Digite 0 para calcular a média");
            }
        }while (valor!= 0);
     for (Double numeros :valores) {
         soma += numeros;
         System.out.println("A soma desses numeros será " + soma);
    }
        media=soma/contador;
        System.out.println("A média desses números será: "+media);}
}
