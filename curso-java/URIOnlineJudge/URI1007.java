import java.util.Scanner;
public class URI1007{
    public static void main(String args[]){
    int a,b,c,d,DIF;
    Scanner input = new Scanner(System.in);
    a=input.nextInt();
    b=input.nextInt();
    c=input.nextInt();
    d=input.nextInt();
    DIF=(a*b)-(c*d);
    System.out.println("DIFERENCA = " + DIF);
}
}