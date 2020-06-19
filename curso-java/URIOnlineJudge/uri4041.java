import java.util.Scanner;
public class uri4041{
    public static void main(String args[]){
        float x,y;
        Scanner teclado = new Scanner(System.in);
        x=teclado.nextFloat();
        y=teclado.nextFloat();
        if (x==y && x==0){
            System.out.println("Origem");
        }
        else{
            if (x==0){
                System.out.println("Eixo X");
            }
            else{
                if (y==0){
                    System.out.println("Eixeo Y");
                }
                
                    else{
                        if (x >0 && y > 0){
                            System.out.println("Q1");
                        }
                        else{
                            if(x<0 && y>0){
                                System.out.println("Q2");
                            }
                            else{
                                if (x<0 && y<0){
                                    System.out.println("Q3");
                                }
                                else{
                                    System.out.println("Q4");
                                }
                            }
                        }
                    }
                
            }
        }
    }
}