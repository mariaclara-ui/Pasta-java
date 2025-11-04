package Ativ20_For_Each;

import java.util.Scanner;

public class Ativ20_For_Each_08 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite as temperaturas por dia");
        double vet[]=new double[7];
        int contador=1;
        for (double temperaturas : vet) {
            temperaturas=sc.nextDouble();
            contador++;
            if (temperaturas>=35) {
                System.out.println("Calor elevado no dia x");
                System.out.println("Você deseja saber qual e o dia referênte do alerta?");
                String resposta=sc.nextLine();
                if(resposta.equalsIgnoreCase("Sim")){
                    System.out.println("O dia do alerta será:"+contador);
                }
            }
        }
    }
}



