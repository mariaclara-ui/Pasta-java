import java.util.Scanner;

public class Atividade_11_funcoes_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de particulas no ar:");
        int particulas = sc.nextInt();
        int classificacao = max(particulas);
    }
    public  static int max(int particulas ){
        if (particulas<=50){
            System.out.println("Bom.");
            return 1;
        }
        else if (particulas<=100){
            System.out.println("Ruim.");
            return 2;
        }
        else {
            System.out.println("critico");
            return 0;
        }
    }

}

