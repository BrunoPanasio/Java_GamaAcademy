import java.util.Scanner;
public class e1002{
    public static void main(String args[]){
    double n,A,R;
    n = 3.14159;
    Scanner input = new Scanner(System.in);
    R=input.nextDouble();
    A=n*R*R;
    System.out.printf("A=%.4f\n",A);
}
}