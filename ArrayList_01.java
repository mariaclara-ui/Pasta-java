import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite as tarefas separadas por virgula:");
        String resposta= sc.nextLine();
        ArrayList<String> tarefas=new ArrayList<>();
        String[] partes=resposta.split(",");
        int contador=1;
        System.out.println("Voce deseja receber uma lista númerada?");
        String numerada= sc.next();
        if (numerada.equalsIgnoreCase("sim")){
            for (String quantas: partes){
                System.out.println(contador+"° "+quantas);
                contador++;
            }

        }
        else {
            System.out.println("A lista será "+partes);
        }




    }
}
