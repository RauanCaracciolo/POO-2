package aula.colecoes;

public class Pessoa implements Comparable<Pessoa>{

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        if(nome != null){
            this.nome = nome;
        }else {
            throw new RuntimeException("Nome Invalido"); //Cai na prova, RuntimeExpection é a UNICA execessao que nao precisa ser tratada
        }
    }

    public void setIdade(int idade) {
        if(idade > 0){
            this.idade = idade;
        }else {
            throw  new RuntimeException("Idade invalida");
        }
    }
    @Override
    public String toString(){
        return getNome() + " (" + getIdade() + ")";
    }
    @Override
    public int compareTo(Pessoa t){
        if (getIdade() == t.getIdade()){
            return 0;
        }else{
            if (getIdade() > t.getIdade()){
                return 1;
            }else {
                return -1;
            }
        }
    }
}
