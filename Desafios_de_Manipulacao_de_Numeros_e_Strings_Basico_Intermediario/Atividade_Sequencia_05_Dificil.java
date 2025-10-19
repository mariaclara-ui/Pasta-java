package Desafios_de_Manipulacao_de_Numeros_e_Strings_Basico_Intermediario;
import java.util.Scanner;
public class Atividade_Sequencia_05_Dificil {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Digite o número de linhas da pirâmide: ");
        int linhasTotal = sc.nextInt();
        for (int QualLinha = 1; QualLinha <= linhasTotal; QualLinha++) {
            for (int espaco = linhasTotal - QualLinha; espaco > 0; espaco--) {//Para ficar centralizado.
                System.out.print(" ");
            }
            for (int quantidade = 1; quantidade <= QualLinha;quantidade++) {//para imprimir a quantidade de numeros desejada.
                System.out.print(QualLinha);
            }
            System.out.println();
        }
    }
}
