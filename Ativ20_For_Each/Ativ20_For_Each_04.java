import java.util.Scanner;

public class Ativ20_For_Each_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas notas?");
        int n = sc.nextInt();
        int[] vet = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            vet[i] = sc.nextInt();
            for (int notas : vet) {
                n++;
                if (notas >= 60) {
                    System.out.println(notas + " Aprovado.");
                } else {
                    System.out.println(notas + " Reforço.");
                }

            }
        }
    }
}
