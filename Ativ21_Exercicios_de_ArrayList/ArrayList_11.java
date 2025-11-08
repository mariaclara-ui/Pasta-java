package Ativ21_Exercicios_de_ArrayLis;

import java.util.Scanner;
import java.util.ArrayList;
public class ArrayList_11 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite as temperaturas por dia:");
        ArrayList<Double> temperaturas = new ArrayList<>();

        for (int Contador = 1; Contador <= 7; Contador++) {
            System.out.print("Dia " + Contador + ": ");
            double temp = sc.nextDouble();
            temperaturas.add(temp);
        }

        // exibição com for-each e verificação
        System.out.println("temperaturas:");
        int contador = 1;
        for (double temp : temperaturas) {
            if (temp >= 35) {
                System.out.println("Dia " + contador + ": " + temp + "°C → Alerta de calor!");
            } else {
                System.out.println("Dia " + contador + ": " + temp + "°C");
            }
            contador++;
        }
    }
}


