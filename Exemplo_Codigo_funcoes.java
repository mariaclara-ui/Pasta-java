package Exemplos;
import java.util.Scanner;
public class Exemplo_Codigo_funcoes {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        System.out.println("Enter theree numbers:");
        int a =sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        int higher=max(a,b,c);
        ShowResult(higher);
        sc.close();
    }
    public static int max(int x,int y,int z){
        int aux;
        if (x>y && x>z){
            aux=x;
        }
        if (y>z){
            aux=y;
        }
        else {
            aux=z;
        }
        return aux;
    }
    public static void  ShowResult(int valeu){
        System.out.println("Higher = "+valeu);
    }
}
