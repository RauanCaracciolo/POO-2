package aula.padroesDesign.comportamentais.templateMethod;

public abstract class  Casa {
    public abstract void paredes();
    public abstract void portas();
    public abstract void janelas();
    public  void telhado(){
        System.out.println("Telha Francesa.");
    }

    public void construir(){
        paredes();
        telhado();
        portas();
        janelas();
    }
}
