import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite os nomes desejados:");
        String nomes;
        ArrayList<String> listaNomes=new ArrayList<>();
        do {
            nomes= sc.nextLine();
            if (listaNomes.contains(nomes)) {
                System.out.println("Esté nome já esta na lista.");
            }
            else {
                listaNomes.add(nomes);
            }
            System.out.println("Se deseja finalizar digite FIM:");
        }while (!nomes.equalsIgnoreCase("FIM"));
    }
}
