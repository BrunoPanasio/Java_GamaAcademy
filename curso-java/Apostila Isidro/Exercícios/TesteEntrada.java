import java.util.Scanner;
public class TesteEntrada{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int a,b,c;
        a=teclado.nextInt();
        System.out.println("O valor digitado foi:" + a);
        b=teclado.nextInt();
        System.out.println("O valor digitado foi:" + b);
        c=teclado.nextInt();
        System.out.println("O valor digitado foi:" + c);

    }
}
