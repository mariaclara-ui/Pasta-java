package Desafios_de_Manipulacao_de_Numeros_e_Strings_Basico_Intermediario;
import java.util.Scanner;
public class Atividade_Sequencia_02_Dificil {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite o número:");
        int numero = sc.nextInt();

        if (numero >= 1 && numero <= 399) {
            System.out.println("O número será convertido.");

            while (numero > 0) {
                if (numero >= 100) {
                    System.out.print("C");
                    numero -= 100;
                }
                else if (numero >= 90) {
                    System.out.print("XC");
                    numero -= 90;
                }
                else if (numero >= 50) {
                    System.out.print("L");
                    numero -= 50;
                }
                else if (numero >= 40) {
                    System.out.print("XL");
                    numero -= 40;
                }
                else if (numero >= 10) {
                    System.out.print("X");
                    numero -= 10;
                }
                else if (numero >= 9) {
                    System.out.print("IX");
                    numero -= 9;
                }
                else if (numero >= 5) {
                    System.out.print("V");
                    numero -= 5;
                }
                else if (numero >= 4) {
                    System.out.print("IV");
                    numero -= 4;
                }
                else if (numero >= 1) {
                    System.out.print("I");
                    numero -= 1;
                }
            }
        }
        else {
            System.out.println("Número inválido.");
        }
    }
}
