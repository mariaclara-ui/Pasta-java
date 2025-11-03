import java.util.Scanner;

public class Ativ20_For_Each_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite palavras:");
        String entrada=sc.nextLine();
        String[] palavras=entrada.split(",");
        for (String palavra:palavras){
            palavra=palavra.trim();
            if (palavra.length()<=4){
                System.out.println("As palavras com ate quatro letras serão:"+palavra);
            }
        }
    }
}
