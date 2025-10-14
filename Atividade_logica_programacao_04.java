import java.util.Random;
import java.util.Scanner;
public class Atividade_logica_programacao_04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        double totalpecas=200;
        double defeitos=0;
        double resultado=0;
        for (int numero=1;numero<=200;numero++){
            System.out.println("A peça é defeituosa? (sim/não)");
            String defeituosa= sc.nextLine();
            if (defeituosa.equalsIgnoreCase("sim")){
                defeitos++;
            }
            else {
                System.out.println("Peça ideal.");
            }
        }
        resultado=(defeitos*100)/totalpecas;
        System.out.println("A porcentagem de defeitos do lote é:" +resultado+"%");
    }
}
