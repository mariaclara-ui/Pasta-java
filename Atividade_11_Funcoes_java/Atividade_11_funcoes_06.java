import java.util.Scanner;
public class Atividade_11_funcoes_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite qual e a distancia do obstaculo?");
        int distancia = sc.nextInt();
        int DistanciaObs = max(distancia);
    }
    public  static int max(int DistanciaObs){
        if (DistanciaObs<5){
            System.out.println("Freiar.");
            return 1;
        }
        else if (DistanciaObs<=15){
            System.out.println("Reduzir velocidade.");
            return 2;
        }
        else {
            System.out.println("Acelerar.");
            return 0;
        }
    }
}
