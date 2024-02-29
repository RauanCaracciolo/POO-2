package aula.arquivos;
import java.io.Serializable;
public class Pessoa implements Serializable {
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private String cpf;

    public Pessoa(String nome, int idade, double altura, double peso, String cpf) {
        setNome(nome);
        setIdade(idade);
        setAltura(altura);
        setPeso(peso);
        setCpf(cpf);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if(idade > 0){
            this.idade = idade;
        }else {
            throw new RuntimeException("Idade: " + idade + " invalida");
        }
    }

    public void setAltura(double altura) {
        if(altura > 0){
            this.altura = altura;
        }else {
            throw new RuntimeException("Altura: " + altura + " invalido");
        }
    }

    public void setPeso(double peso) {
        if(peso > 0){
            this.peso = peso;
        }else {
            throw new RuntimeException("Peso: " + peso + " invalido");
        }
    }

    public void setCpf(String cpf) {
        if(cpf.matches("^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$")){
            this.cpf = cpf;
        } else{
            throw new RuntimeException("CPF: " + cpf + " invalido");
        }
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getCpf() {
        return cpf;
    }
    @Override
    public String toString(){
        return getNome() + " (" + getIdade() + ", " + getAltura() + ", " + getPeso() + ", " + getCpf() +" )";
    }
}
