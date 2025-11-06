import java.util.Scanner;
import java.util.ArrayList;
public class ArrayList_08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os codigos:");
        String codigo = sc.nextLine();
        ArrayList<String> lista = new ArrayList<>();
        String[] vet = codigo.split(",");

        for (String item : vet) {
            lista.add(item.trim());
        }

        String continua;
        do {
            System.out.println("O codigo será: " + lista);

            System.out.print("Digite um código para buscar (ou 'FIM' para sair): ");
            continua = sc.nextLine();

            if (!continua.equalsIgnoreCase("FIM")) {
                int contador = 0;
                for (String codigos : vet) {
                    if (codigos.trim().equalsIgnoreCase(continua)) {
                        {
                            contador++;
                            System.out.println("O código será: " + continua);
                        }
                    }
                }
            }
        }while (!continua.equalsIgnoreCase("FIM")) ;

    }
}




