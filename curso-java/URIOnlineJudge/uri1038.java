import java.util.Scanner;
public class uri1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double code, qtd,total;
        code = teclado.nextInt();
        qtd = teclado.nextInt();

        if (code == 1){
            total  = 4*qtd;
            System.out.printf("Total: R$ %.2f\n", total);
        }
        else {  
            if(code ==2){
                total  = 4.5*qtd;
                System.out.printf("Total: R$ %.2f\n", total);
            }
            else{
                if (code ==3){
                    total  = 5*qtd;
                    System.out.printf("Total: R$ %.2f\n", total);
                }
                else{
                    if(code==4){
                        total  = 2*qtd;
                        System.out.printf("Total: R$ %.2f\n", total);
                    }
                    else{
                        total  = 1.5*qtd;
                        System.out.printf("Total: R$ %.2f\n", total);
                    }
                }
            }
        }
    }
}