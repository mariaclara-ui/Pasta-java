import java.util.Scanner;
public class Exercicio_condicional_Ternaria_19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite o número de horas trabalhadas:");
        double horas= sc.nextDouble();
        String resposta;
        System.out.println("Digite o valor por hora: ");
        double valor= sc.nextDouble();
        double resultado=horas*valor;
        resposta=(resultado>=2.000)?"Salário bom.":"Salario ruim.";
        System.out.println(resposta);
        }
    }

