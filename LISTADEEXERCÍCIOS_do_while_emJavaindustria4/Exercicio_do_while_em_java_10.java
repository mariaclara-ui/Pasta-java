package EXERCICIOS_do_while_emJavaindustria4;
import java.util.Scanner;
public class Exercicio_do_while_em_java_10 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite a quantidade de ciclos de produção");//OEE, é uma métrica que mede a produtividade de máquinas industriais, calculando a porcentagem do tempo de fabricação que é realmente produtivo.
        String escolha;
        double ciclos;
        double paradas;
        double contadorC=0;
        double contadorP=0;
        double resultado;
        do {
            ciclos= sc.nextInt();
            sc.nextLine();
            if (ciclos>0){
                System.out.println("Cilo valido.");
                contadorC+=ciclos;
            }
            else {
                System.out.println("Ciclo invalido.");
            }
            contadorC++;
            System.out.println("Digite a quantidade de paradas:");
            paradas= sc.nextInt();
            sc.nextLine();
            if (paradas>=0){
                System.out.println("Parada valida.");
                contadorP+=paradas;
            }
            else {
                System.out.println("Parada invalida.");
            }
            contadorP++;
            System.out.println("Voce deseja encerrar o ciclo?");
            escolha=sc.nextLine();
        }while (!escolha.equalsIgnoreCase("Sim"));
        resultado=contadorC/(contadorC+contadorP);
        System.out.println("O resultado da eficiência final será de "+resultado);//OEE, Eficiência Global do Equipamento.
    }
}
