import java.util.Scanner;
public class Atividade_11_funcoes_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 1 para operador basico");
        System.out.println("Digite 2 para supervisor");
        System.out.println("Digite 3 para engenheiro");
        System.out.println("Qual e o cargo?");
        int cargo = sc.nextInt();
        int qualCargo = max(cargo);
    }
    public  static int max(int qualCargo){
        if (qualCargo == 1){
            System.out.println("Acesso restrito.");
            return 1;
        }
        else if (qualCargo==2){
            System.out.println("Acesso parcial");
            return 2;
        }
        else if (qualCargo==3) {
            System.out.println("Acesso total");
            return 3;
        }
        else{
            System.out.println("Cargo não reconhecido.");
            return 0;
        }
    }
}