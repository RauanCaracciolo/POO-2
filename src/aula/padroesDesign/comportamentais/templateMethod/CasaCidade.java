package aula.padroesDesign.comportamentais.templateMethod;

public class CasaCidade extends Casa{
    @Override
    public void paredes() {
        System.out.println("Blocos de concreto");
    }

    @Override
    public void portas() {
        System.out.println("Portas de madeira");
    }

    @Override
    public void janelas() {
        System.out.println("Janelas de vidro");
    }
}
