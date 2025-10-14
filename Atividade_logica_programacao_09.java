import java.util.Random;
public class Atividade_logica_programacao_09 {
    public static void main(String[] args) {
        Random random=new Random();
        int demandamedia= 1500;
        int media=0;
        int mediaFinal=0;
        for (int produtos=0;produtos<=10;produtos++){
            produtos= random.nextInt(1500);
            System.out.println("A media de vendas de cada produto é:" +produtos);
            media+=produtos;
        }
        mediaFinal=media/10;
        System.out.println("A média fianal será" +mediaFinal);
    }
}
