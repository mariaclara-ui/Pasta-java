import java.util.Scanner;

public class Ativ20_For_Each_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os codigos:");
        String codigo = sc.nextLine();
        String[] vet = codigo.split(",");
        for (int letra = 0; letra < vet.length; letra++) {
            vet[letra] = vet[letra].trim();
        }
        String continua;
        do {
            System.out.println("O codigo será:" + vet);

            if (!continua.equalsIgnoreCase("FIM")) ;
            int contador = 0;
            for (String codigos : vet) {
                if (codigo.equalsIgnoreCase(continua)) {
                    contador++;
                    System.out.println("o codigo será" + continua);
                }
                while (codigo.equalsIgnoreCase("FIM")) ;
            }
        }
    }
}