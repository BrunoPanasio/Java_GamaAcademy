public class Livro{
    private String titulo, autor, categoria, posicao;
    private int ano;
    private boolean emprestado;

    public Livro(String titulo, String autor,int ano, String categoria, String posicao,  boolean emprestado){
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.posicao = posicao;
        this.ano = ano;
        this.emprestado = emprestado;
    }

    public String imprimir(){
        return titulo+" "+autor+" "+categoria+" "+posicao+" "+ano+" "+emprestado;
    }
    public String getEmprestado(){
        if (emprestado==true){
            return "Livro emprestado no momento.";
        }
        else{
            return "Livro disponível para emprestimo.";
        }
    }
    
    public boolean getEmprestar(){
        return this.emprestado = true;
    }

    public boolean getDevolver(){
        return this.emprestado = false;
    }
}