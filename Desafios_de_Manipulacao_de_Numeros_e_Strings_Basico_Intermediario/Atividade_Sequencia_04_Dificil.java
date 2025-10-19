package Desafios_de_Manipulacao_de_Numeros_e_Strings_Basico_Intermediario;
import java.util.Scanner;
public class Atividade_Sequencia_04_Dificil {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite o valor que será sacado:");
        int valor=sc.nextInt();
        int contador2=0;
        int contador10=0;
        int contador50=0;
        while (valor>=2) {
            if(valor>=50){
                contador50++;
                valor-=50;
            }
            else if(valor>=10){
                contador10++;
                valor-=10;
            }
            else if(valor>=2){
                contador2++;
                valor-=2;
            }
        }
        System.out.println("Você precisa de "+contador50+" notas de 50 "+contador10+" notas de 10 "+contador2+" notas de 2.");
    }
}

