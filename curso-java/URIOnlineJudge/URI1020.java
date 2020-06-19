impot java.util.Scanner;
public class URI1020{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int idadeDias = input.nextInt();

        int ano,meses,dias;
        int resto;

        anos = idadeDias / 365; // 400 -> 400/365 =1
        resto = idadedDias % 365; // 400 --> 400%365 = 35

        meses = resto /30;
        dias = resto % 30;

        System.out.println(anos+"Ano(s)");
        System.out.println(meses+"Meses");
        System.out.println(dias+"Dia(s)");

    }
}