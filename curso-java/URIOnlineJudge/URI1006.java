import java.util.Scanner;
public class URI1006{
    public static void main(String args[]){
    double a,b,c,MEDIA;
    Scanner input = new Scanner(System.in);
    a=(input.nextDouble()*2)/10;
    b=(input.nextDouble()*3)/10;
    c=(input.nextDouble()*5)/10;
    MEDIA=(a+b+c);
    System.out.printf("MEDIA = %.1f\n",MEDIA);
}
}