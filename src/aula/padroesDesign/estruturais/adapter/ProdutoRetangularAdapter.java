package aula.padroesDesign.estruturais.adapter;

public class ProdutoRetangularAdapter extends ProdutoRetangular{
   public ProdutoRetangularAdapter(ProdutoEsferico p ){
       super(p.getDiametro(),p.getDiametro(),p.getDiametro());
   }
}
