import java.util.Scanner;
public class uri1037{
    public static void main(String args[]){
        float numero;
        Scanner teclado = new Scanner(System.in);
        numero = teclado.nextFloat();

        if (numero < 0 || numero > 100){
            System.out.println("Fora de intervalo");
        }
        else{   
            if (numero <= 25.0){
                System.out.println("Intervalo [0,25]");
            }
                else{
                    if ((numero > 25) && (numero <=50)){
                        System.out.println("Intervalo (25,50]");
                        }
                        else{
                            if ((numero >50) && (numero <=75)){
                                System.out.println("Intervalo (50,75]");
                            }
                            else{
                                System.out.println("Intervalo (75,100]");
                                }
                            }
                        
                    }
                
            }
        }
    }
