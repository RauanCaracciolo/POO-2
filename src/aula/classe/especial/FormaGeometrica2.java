package aula.classe.especial;

public class FormaGeometrica2 {
    public enum cor{
        VERMELHO,
        VERDE,
        AZUL,
        BRANCO,
        PRETO;
    }
    private String nome, codigo;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(String codigo) {
        if(codigo.matches("#([a-fA-F0-9]){6}")){
            this.codigo = codigo;
        }else {
            throw new RuntimeException("Codigo hexadecimal RGB invalido.");
        }
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }
}
