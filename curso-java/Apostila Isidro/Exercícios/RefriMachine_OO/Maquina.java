public class Maquina{
    private double credito;
    private Refrigerante lista[];

    
    public Maquina(){
        this.credito = 0.0;        
        lista = new Refrigerante[3];
        lista[0] = new Refrigerante("coca",3.5,10);
        lista[1] = new Refrigerante("coca diet",3.5,10);
        lista[2] = new Refrigerante("fanta",3,10);

    }

    public void adicionarCredito(double valor){
        this.credito += valor;
    }

    public double pegarTroco(){
        double troco = this.credito;
        this.credito = 0.0;
        return troco;
    }

    public String obterDisplay(){
        return "Credito R$ "+this.credito+"\n"+
        "[0] -"+lista[0].getNome()+" R$"+lista[0].getPreco()+"\n"+
        "[1] -"+lista[0].getNome()+" R$"+lista[1].getPreco()+"\n"+
        "[2] -"+lista[0].getNome()+" R$"+lista[2].getPreco()+"\n";
    }

    public int comprar(int num){
        if(this.credito >= lista[num].getPreco()){
            if (lista[num].getEstoque() > 0){
                this.credito -= lista[num].getPreco();
                lista[num].tirarEstoque();
                return 0;
            }
            else{
                return 1;
            }
        }
        else{
            return 2;
        }
    }

}