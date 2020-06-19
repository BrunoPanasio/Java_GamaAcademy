//completar - olhar no git LojaDeConveniencia.java  https://github.com/professorisidro/Java_URI

import java.util.Scanner;
public class menu{
    public static void main(final String args[]) {
        Scanner teclado = new Scanner(System.in);
        Maquina m = new Maquina();
        int opcao;
        double valor;

        do {
            System.out.println(m.obterDisplay());
            System.out.println("10 - adicionar credito");
            System.out.println("20 - obter troco");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 0:
                case 1:
                case 2:
                case 3:
                    final int result = m.comprar(opcao);
                    if (result ==0){
                        System.out.println("Compra efetuada! Aproveite!");
                    }
                else if (result ==1){
                        System.out.println("Compra efetuada! Aproveite!");
                    }
                else if (result ==2){
                    System.out.println("Compra efetuada! Aproveite!");
                }
                break;
                case 10:
                    System.out.println("digite o valor a inserir:");
                    valor = teclado.nextDouble();
                    m.adicionarCredito(valor);
                    break;
                case 20:
                valor = m.pegarTroco();
                System.out.println("Seu troco R$ "+valor);
                    break;
                case -1:
                    System.out.println("END");
                    break;
                default:
                    System.out.println("opção invalida");
                    break;
            }
        } while (opcao != -1);

    }
}