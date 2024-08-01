package aula.padroesDesign.estruturais.composite;

import java.util.ArrayList;

public class Caixa implements Produto{
    private String nomeProduto;
    private double valorProduto;
    private ArrayList<Caixa> caixas;
    public Caixa(){
        this(null, 0.0);
    }
    public Caixa(String nomeProduto, double valorProduto){
        setNomeProduto(nomeProduto);
        setValorProduto(valorProduto);
        caixas = new ArrayList<>();
    }
    @Override
    public void setNomeProduto(String nome) {
        nomeProduto = nome;
    }

    @Override
    public String getNomeProduto() {
        return nomeProduto;
    }

    @Override
    public void setValorProduto(double valor) {
        valorProduto = valor;
    }

    @Override
    public double getValorProduto() {
        return valorProduto;
    }
    public void adicionarCaixa(Caixa c){
        caixas.add(c);
    }
    public void removerCaixa(Caixa c){
        caixas.remove(c);
    }
    public Caixa obterCaixa(int indice){
        return caixas.get(indice);
    }
    public double valorTotal(){
        double valor = valorProduto;

        for(Caixa c: caixas){
            valor += c.valorTotal();
        }

        return valor;
    }
}
