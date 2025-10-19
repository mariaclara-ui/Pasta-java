package Desafios_de_Manipulacao_de_Numeros_e_Strings_Basico_Intermediario;
import java.util.Scanner;
public class Atividade_Sequencia_03_Dificil {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite um número com 7 digitos:");
        int numero=sc.nextInt();
        int original=numero;
        int invertido=0;
        while (numero!=0) {
            int resto=numero%10;
            invertido=invertido*10+resto;
            numero=numero/10;
        }
        if(invertido==original){
            System.out.println("Este numero e um palíndromo.");
        }
        else{
            System.out.println("Este numero não e um palíndromo.");
        }
        sc.nextLine();
        System.out.println("Digite uma palavra:");
        String palavra=sc.nextLine();

        String palavraInvertida = new StringBuilder(palavra).reverse().toString();
        if (palavra.equalsIgnoreCase(palavraInvertida)){
            System.out.println("A palavra e um palindromo.");
        }
        else {
            System.out.println("A palavra não é um palíndromo.");
        }
    }
}
