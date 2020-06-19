public class Refrigerante{
    private String nome;
    private double preco;
    private int estoque;

    public Refrigerante(String nome, double preco, int estoque){
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public void tirarEstoque(){
        if (this.estoque >0){
            this.estoque--;
        }
        else{
           System.out.println("Produto sem estoque");
        }
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public void setEstoque(int estoque){
        this.estoque = estoque;
    }
    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    public int getEstoque(){
        return estoque;
    }

    public String getRefrigeranteInfo(){
        return "Nome: "+nome+" preco: "+preco+" estoque: "+estoque;
    }
}