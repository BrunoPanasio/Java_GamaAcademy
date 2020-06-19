import java.util.Scanner;
public class Alg5{
    public static void main(String args[]){
        Scanner input = new Scanner (System.in);

        float tempo, vel, dist, consumo;

        System.out.println("Digite o tempo de sua viagem: ");
        tempo = input.nextFloat();
        System.out.println("Digite a velocidade media");
        vel = input.nextFloat();

        dist = tempo *vel;
        consumo = dist /12;
        
        System.out.printf("Voce percorreu %.3f km a uma velocidade de %.3f km/h e consumiu %.3f litros\n", dist, vel, consumo);

    }
}