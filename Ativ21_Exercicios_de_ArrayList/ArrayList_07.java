import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite suas tarefas separadas por vírgula:");
        String linha = sc.nextLine();
        String[] tarefas = linha.split(",");
        ArrayList<String> lista = new ArrayList<>();
        for (String t : tarefas) {
            t = t.trim();
            if (!t.isEmpty()) {
                lista.add(t);
            }
        }
        System.out.println("\n Checklist de estudos:");
        int numero = 1;
        for (String tarefa : lista) {
            System.out.println(numero + ". " + tarefa);
            numero++;
        }
    }
}
