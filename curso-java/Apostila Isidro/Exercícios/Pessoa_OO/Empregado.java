public class Empregado{
    private String nome;
    private double salario;

    public Empregado(String no, double sal){
        nome = no;
        salario = sal;
    }

    String imprimir(){
        return nome+" tem salario:"+String.format("%.2f",salario);
    }

    public void setAumento(double aumento){
        salario = salario + salario*aumento;
    }
}