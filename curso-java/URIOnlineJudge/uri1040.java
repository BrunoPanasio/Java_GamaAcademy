import java.util.Scanner;
public class uri1040{
    public static void main(String args[]){
    float a,b,c,d,e,MEDIA, MEDIAFINAL;
    Scanner input = new Scanner(System.in);
    a=(input.nextFloat()*2);
    b=(input.nextFloat()*3);
    c=(input.nextFloat()*4);
    d=(input.nextFloat()*1);
    MEDIA=(a+b+c+d)/10;
    System.out.printf("Media: %.1f\n",MEDIA);
    if (MEDIA >= 7.0){
        System.out.println("Aluno aprovado.");
    }
    else {
        if (MEDIA < 5.0){
            System.out.println("Aluno reprovado.");
        }
        else{
            System.out.println("Aluno em exame.");
            e=input.nextFloat();
            System.out.printf("Nota do exame: %.1f\n",e);
            MEDIAFINAL = (MEDIA + e)/2;
            if (MEDIAFINAL >= 5){
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f\n",MEDIAFINAL);
            }
            else{
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f\n",MEDIAFINAL);
            }
        }
    }
}
}