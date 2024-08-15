package aula.padroesDesign.comportamentais.templateMethod;

import javax.swing.plaf.SliderUI;

public class CasaPraia extends Casa{

    @Override
    public void paredes() {
        System.out.println("Tijolo de Barro.");
    }

    @Override
    public void portas() {
        System.out.println("Portas de Aluminio");
    }

    @Override
    public void janelas() {
        System.out.println("Janelas de Aluminio");
    }
}
