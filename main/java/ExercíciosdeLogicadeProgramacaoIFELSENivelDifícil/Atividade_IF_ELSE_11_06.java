package ExercíciosdeLogicadeProgramacaoIFELSENivelDifícil;
import java.util.Scanner;
public class Atividade_IF_ELSE_11_06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite qual e a distancia do obstaculo?");
        int distancia= sc.nextInt();
        if (distancia<5){
            System.out.println("Freiar.");
        }
        else if (distancia<=15){
            System.out.println("Reduzir velocidade.");
        }
        else {
                System.out.println("Acelerar.");
        }

    }
}
