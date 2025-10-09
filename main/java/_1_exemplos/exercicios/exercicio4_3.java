package exercicios;

import java.util.Scanner;

public class exercicio4_3 {
    public static void main(String[] args) {
        int a, b, c, d, x;
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite o primeiro numero");
        a = sc.nextInt();
        System.out.println("Digite o segundo numero");
        b= sc.nextInt();
        System.out.println("Digite o terceiro numero");
        c = sc.nextInt();
        System.out.println("Digite o quarto numero");
        d= sc.nextInt();
        x = a*b-c*d;
        System.out.printf("O resultado é;"+ x);


    }
}
