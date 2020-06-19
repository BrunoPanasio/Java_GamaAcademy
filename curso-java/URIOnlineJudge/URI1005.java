import java.util.Scanner;
public class URI1005{
    public static void main(String args[]){
    double a,b,MEDIA;
    Scanner input = new Scanner(System.in);
    a=(input.nextDouble()*3.5)/11;
    b=(input.nextDouble()*7.5)/11;
    MEDIA=(a+b);
    System.out.printf("MEDIA = %.5f\n",MEDIA);
}
}