package For;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class For18 {
    public static void main(String[] str) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String palavra = scan.nextLine();
        int result = stringtrasprafrente(palavra);

    }

    private static int stringtrasprafrente(String palavra) {
        int length = palavra.length();
        for(int i = 0; i < palavra.length() / 2; i++) {
            if(palavra.charAt(i) != palavra.charAt(palavra.length() - 1 - i)) {

            }
        }return stringtrasprafrente(palavra);
    }
    public static void Result (int result){
        System.out.println(result);
    }

}

