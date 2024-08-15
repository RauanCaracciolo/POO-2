package aula.revisao;

public class Produto {
    private String nome;
    private TipoProduto tipo;
    private String descricao;
    private double valor;

    public Produto(String nome, TipoProduto tipo, String descricao, double valor) {
        setNome(nome);
        setTipo(tipo);
        setDescricao(descricao);
        setValor(valor);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        if(!nome.matches("[A-Z][a-z]+(\\s[A-Z][a-z]+)*")){
            throw new RuntimeException("O nome deve seguir o padrão: [A-Z][a-z]+(\\s[A-Z][a-z]+)*");
        }
        this.nome = nome;
    }

    public TipoProduto getTipo() {
        return tipo;
    }

    public void setTipo(TipoProduto tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if(descricao == null){
            throw new RuntimeException("A descrição do produto nao pode ser nula (null)!");
        }
        if(!descricao.matches("[A-Z].*")){
            throw new RuntimeException("A descrição deve seguir o padrão: [A-Z]\\.");
        }
        this.descricao = descricao;
    }


    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if(valor > 0){
            this.valor = valor;
        }else {
            throw new RuntimeException("Erro no valor do produto");
        }
    }
    @Override
    public String toString(){
        return "Nome: " + nome + "\nTipo: " + tipo + "\nDescrição: " + descricao + "\nValor: R$" + valor;
    }
}
