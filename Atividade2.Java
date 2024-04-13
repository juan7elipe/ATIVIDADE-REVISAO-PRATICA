package objetos;

public class Produto {

    private String nome;
    private double preco;
    private int qtdeestoque;

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
