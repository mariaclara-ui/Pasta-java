import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayList_04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite a frase desejada:");
        String frase= sc.nextLine();

        String[] partes=frase.split(",");

        ArrayList<String> todasFrases=new ArrayList<>(Arrays.asList(partes));
        for (String palavras:partes){
            palavras=palavras.trim();
            if (palavras.length()<=4){
                System.out.println("As palavras com atá quatro letras são: "+palavras);
            }
        }

    }
}
