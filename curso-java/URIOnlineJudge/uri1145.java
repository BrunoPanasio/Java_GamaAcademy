import java.util.Scanner;
public class uri1145{
    public static void main(String args[]){
        Scanner teclado  = new Scanner(System.in);
        int x,y,i,j;
        x=teclado.nextInt();
        y=teclado.nextInt();
        i=1;
        j=1;
        while (j <= y){
            while ((i <= x) && (j<=y)){
                if(i==x){
                    System.out.println(j);
                    j++;
                    i++;
                }
                else{
                    System.out.print(j+" ");
                    j++;
                    i++;
                }
            }
            i=1;
        }
    }
}