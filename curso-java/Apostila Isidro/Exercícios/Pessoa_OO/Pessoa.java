public class Pessoa{
    // definição dos atributos "blindados" / encapsulados
    // estes atributos só tem acesso dentro da classe
    private String nome;
    private String sobrenome;
    private int idade;
    private char sexo;


    //metodo contrutor para quando dar "new" num novo objetos
    //seja obrigado a passar os 4 dados nesta sequencia
    public Pessoa(String no, String so, int id, char se){
        nome = no;
        sobrenome = so;
        idade = id;
        sexo = se;
    }

    //metodos GET e SET para cada atriburo
    // GET = metodo para consultar
    // SET = metodo para alterar atributo
    void setNome(String no){
        nome = no;
    }

    String getNome(){
        return nome;
    }

    void setSobrenome(String so){
        sobrenome = so;
    }

    String getSobrenome(){
        return sobrenome;
    }

    void setIdade(int id){
        idade = id;
    }

    int getIdaded(){
        return idade;
    }

    String imprimir(){
        return nome+" "+sobrenome+" ("+sexo+") idade: "+idade;
    }

}