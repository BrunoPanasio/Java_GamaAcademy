import java.util.Scanner;
public class uri1060{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        int num, cont;
        num = 1;
        cont =0;
        float valor, media;
        media = 0;
        valor = 0;
        while (num <= 6){
            valor = entrada.nextFloat();
            if (valor > 0){
                cont++;
                media += valor;
            }
        num++;
        }
        System.out.println(cont+" valores positivos");
        System.out.printf("%.1f\n",(media /cont));
    }

}