package Atividade_11_funcoes;
import java.util.Scanner;
public class Atividade_11_funcoes_16 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite qual e o grau de visibilidade dos defeitos.");
        String defeitos= sc.nextLine();
        String visibilidadeDefeitos=max(defeitos);
    }
    public static String max(String visibilidadeDefeitos){
        if (visibilidadeDefeitos.equals("visivel")){
            System.out.println("Nivel alto.");
            return "Nivel atlo.";
        }
        else if (visibilidadeDefeitos.equals("microscopio")){
            System.out.println("Nivel médio.");
            return "Nivel médio.";
        }
        else if (visibilidadeDefeitos.equals("ausente")){
            System.out.println("Nivel baixo.");
            return "Nivel baixo.";
        }
    }
}
