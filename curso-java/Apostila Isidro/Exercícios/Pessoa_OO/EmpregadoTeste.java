public class EmpregadoTeste{
    public static void main(String args[]){
        Empregado e1;

        e1 = new Empregado("Bruno", 10000);

        System.out.println(e1.imprimir());
        e1.setAumento(0.05);
        System.out.println(e1.imprimir());
    }
}