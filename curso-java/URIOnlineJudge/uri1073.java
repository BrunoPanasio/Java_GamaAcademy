import java.util.Scanner;
public class uri1073{
    public static void main(String arags[]){
        Scanner teclado = new Scanner(System.in);
        int n,i;
        i=1;
        n=teclado.nextInt();
        while (i <=n){
            if (i%2==0){
                System.out.println(i+"^2 = "+(i*i));
            }
            i++;
        }
    }
}