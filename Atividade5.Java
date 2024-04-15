package objetos;

public class Produto3 {

String nome;
double preco;
int qtdeestoque;

// Construtores

    public Produto3(String nome){
        this.nome = nome;
        this.preco = 0.0;
        this.qtdeestoque = 0;
    }

    public Produto3(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        this.qtdeestoque = 0;
    }

    public Produto3(String nome, double preco, int qtdeestoque){
        this.nome = nome;
        this.preco = preco;
        this.qtdeestoque = qtdeestoque;
    }


    //Getters e Setters

   public String getNome(){
        return nome;
   }

    public double getPreco(){
        return preco;
    }

    public int getQtdeestoque(){
        return qtdeestoque;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setQtdeestoque(int qtdeestoque){
        this.qtdeestoque = qtdeestoque;
    }
}
