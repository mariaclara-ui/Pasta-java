import java.util.Scanner;

public class Ativ19_Vetores_05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite as palaras:");
        String frase=sc.nextLine();
        String [] palavras=frase.split("");

        int contador=0;
        for (int qualLetra=0;qualLetra< palavras.length;qualLetra++){
            if (palavras[qualLetra].length()>5){
                contador++;
            }
        }
        System.out.println("As palavras com mais de cinco caracteres seão:"+contador);
    }
}
