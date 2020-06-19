import java.util.Scanner;
public class Alg2{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int operacao;
        System.out.println("Digite o número da operação que deseja realizar?");
        System.out.println("1 área quadrado");
        System.out.println("2 área retangulo");
        System.out.println("3 área do triangulo");
        System.out.println("4 área do losango");
        System.out.println("5 área do trapezio");
        System.out.println("6 volume do cubo");
        System.out.println("7 volume de um paralelepípedo");
        System.out.println("8 Volume de um cilindro");
        operacao=teclado.nextInt();
        
        switch (operacao){
            case 1:
            //area do quadrado
                System.out.println("1 Cálculo de quadrado selecionado.");
                float lado, area;
                System.out.println("Digite o tamanho do lado do quadrado:");
                lado=teclado.nextFloat();
                area = lado * lado;
                System.out.println("A area do quadrado eh:" + area);
            break;
            case 2:
            //area do retangulo
                System.out.println("2 Cálculo de retangulo selecionado.");
                float base, altura, arearetangulo;
                System.out.println("Digite o tamanho da base:");
                base=teclado.nextFloat();
                System.out.println("Digite o tamanho da altura:");
                altura=teclado.nextFloat();
                arearetangulo = base * altura;
                System.out.println("A area do retangulo eh:" + arearetangulo);
            break;
            case 3:
                //area do triangulo
                System.out.println("3 Cálculo de triangulo selecionado.");
                float baset, alturat, areatriangulo;
                System.out.println("Digite o tamanho da base:");
                baset=teclado.nextFloat();
                System.out.println("Digite o tamanho da altura:");
                alturat=teclado.nextFloat();
                areatriangulo = (float)(baset * alturat) /2;
                System.out.println("A area do triangulo eh:" + areatriangulo);
            break;
            case 4:
                //area do losango
                System.out.println("4 Cálculo de losango selecionado.");
                float diag1, diag2, arealosango;
                System.out.println("Digite o tamanho da diagonal 1:");
                diag1=teclado.nextFloat();
                System.out.println("Digite o tamanho da diagonal 2:");
                diag2=teclado.nextFloat();
                arealosango = (diag1 * diag2);
                System.out.println("A area do losango eh:" + arealosango);
            break;
            case 5:
                //area do trapezio
                System.out.println("5 Cálculo de trapezio selecionado.");
                float baseMaior, baseMenor, alturatrap, areatrap;
                System.out.println("Digite o tamanho da base maior:");
                baseMaior=teclado.nextFloat();
                System.out.println("Digite o tamanho da base menor:");
                baseMenor=teclado.nextFloat();
                System.out.println("Digite o tamanho da altura:");
                alturatrap=teclado.nextFloat();
                areatrap = (baseMaior + baseMenor) * (float)(alturatrap/2);
                System.out.println("A area do trapezio eh:" + areatrap);
            break;
            case 6:
                //volume do cubo
                System.out.println("6 Cáculo do volume do cubo selecionado.");
                float ladoCubo, areaCubo;
                System.out.println("Digite o tamanho de um lado do cubo:");
                ladoCubo = teclado.nextFloat();
                areaCubo = ladoCubo * ladoCubo * ladoCubo;
                System.out.println("O volume do cubo é:" + areaCubo);
            break;
            case 7:
                //volume do paralelepipedo
                System.out.println("7 Cáculo do volume do cubo selecionado.");
                float alturaPar, larguraPar, profundidadePar, volumePar;
                System.out.println("Digite o tamanho da altura do paralelepipedo:");
                alturaPar = teclado.nextFloat();
                System.out.println("Digite o tamanho da largura do paralelepipedo:");
                larguraPar = teclado.nextFloat();
                System.out.println("Digite o tamanho da profundidade do paralelepipedo:");
                profundidadePar = teclado.nextFloat();
                volumePar = alturaPar * larguraPar * profundidadePar;
                System.out.println("O volume do paralelepipedo eh:" + volumePar);
            break;
            case 8:
            //volume do ciclindro
            System.out.println("8 Cáculo do volume do cilindro selecionado.");
            float raio, pi, alturaCilindro, volumeCilindro;
            System.out.println("Digite o raio do cilindro:");
            raio = teclado.nextFloat();
            System.out.println("Digite o tamanho da altura do cilindro:");
            alturaCilindro = teclado.nextFloat();
            pi = (float)3.14;
            volumeCilindro = alturaCilindro * raio * raio * pi;
            System.out.printf("O volume do cilindro eh: %.2f\n",volumeCilindro);
        break;
        }

        
    }
}