import java.util.Scanner;
public class biblioteca{
    public static void main(String args[]){
    //Livro l1,l2,l3,l4,l5;
    Livro acervo[];// acervo é um conjunto (array) de libros
    acervo = new Livro[5];
    int op;
    Scanner teclado = new Scanner(System.in);
    acervo[0] = new Livro("a","a",1999,"Cat a","Pos A2", false);
    acervo[1] = new Livro("b","b",2000,"Cat B","Pos B2", false);
    acervo[2] = new Livro("c","c",2001,"Cat C","Pos C2", false);
    acervo[3]= new Livro("d","d",2002,"Cat D","Pos D2", false);
    acervo[4] = new Livro("e","e",2000,"Cat E","Pos E2", true);

    System.out.println("livrs ja no catalogo:");

    for (int pos=0; pos < acervo.length; pos++){
            System.out.println(acervo[pos].imprimir());
        }


    /*
    System.out.println("livro l1: "+l1.getEmprestado());
    l1.getEmprestar();
    System.out.println("livro l1: "+l1.getEmprestado());
    l1.getDevolver();
    System.out.println("livro l1: "+l1.getEmprestado());
    */

    /*
    do {
        System.out.println("O que deseja fazer?\n 1. Verificar disponibilidade\n 2.Pegar emprestado\n -1. Sair");
        op = teclado.nextInt();
        switch (op) {
            case 1:
                System.out.println("Qual livro deseja verificar disponibildiade? Digite ID do livro");
                op = teclado.nextInt();
                l[op]
                break;
        
            default:
                break;
        }
    }
    while (op != -1);
    */
    } 
}