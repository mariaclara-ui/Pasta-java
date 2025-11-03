import java.util.Scanner;
public class Ativ20_For_Each_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite os nomes:");
        String entrada= sc.nextLine();
        String [] vect=entrada.split(",");
        int contador=1;
        for (String nome:vect){
            System.out.println(contador+"° "+entrada);
            contador++;
            System.out.println("Você deseja colocar mais nomes?");
            String continuar= sc.nextLine();
            while (continuar.equals("sim")) {
                System.out.println("Digite o proximo nome:");
                entrada = sc.nextLine();
                contador++;
            }
        }
    }
}

