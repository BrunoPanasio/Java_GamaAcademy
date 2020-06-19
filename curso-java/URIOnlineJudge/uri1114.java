import java.util.Scanner;
public class uri1114{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        boolean trava = true;
        int senha;
        do {
            senha = teclado.nextInt();
            if(senha == 2002){
                System.out.println("Acesso Permitido");
                trava = false;
            }
            else{
                System.out.println("Senha Invalida");
            }
        }
        while (trava == true);
        
    }
}