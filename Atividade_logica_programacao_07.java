import java.util.Random;
public class Atividade_logica_programacao_07 {
    public static void main(String[] args) {
        Random random = new Random();
        int media=0;
        int tempomedio=0;
        for (int maquinas=1;maquinas<=50;maquinas++){
            int minutos= random.nextInt(60);
            System.out.println("O tempo da maquina será;"+minutos);
            media+=minutos;
        }
        tempomedio=media/60;
        System.out.println("tempo medio" +tempomedio);
        if (tempomedio<=32){
            System.out.println("Tempo dentro do limite.");
        }
        else {
        System.out.println("Tempo exedido.");
        }
    }
}

