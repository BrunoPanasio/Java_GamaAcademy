import java.util.Scanner;
public class AppTvUser{
    public static void main(String args[]){
        Televisao t = new Televisao();
        Scanner teclado = new Scanner(System.in);
        int opcao;
        //Televisao x = new Televisao();
        
        t.marca = "Samsung";
        t.tamanhoTela=42;
        t.canal=5;
        t.volume=10;

        do{
            System.out.println("0-power / 1-Canal+ / 2-canal- / 3Vol+ / 4vol- / 5Mute / -1Exit");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 0:
                    t.power();
                    break;
                case 1:
                    t.avancarCanal();
                    break;
                case 2:
                    t.voltarCanal();
                    break;
                case 3:
                    t.aumentarVolume();
                    break;
                case 4:
                    t.diminuirVolume();
                    break;
                case 5:
                    t.mutar();
                case -1:
                    break;
                default:
                    break;
            }
        } while (opcao != -1);

    }
}