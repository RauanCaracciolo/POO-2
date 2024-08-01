package aula.padroesDesign.estruturais.flywheight;

import java.util.ArrayList;
import java.util.Random;

public class main {

    public static void main(String[] args) {

        ArrayList<Particula> particulas = new ArrayList<>();
        Random r = new Random();
        ParticulaTextura text = new ParticulaTextura("Azul", "Esfera.tiff");
        for(int i = 0; i < 100000; i ++){
            particulas.add(new Particula(r.nextDouble(), r.nextDouble(), text));
        }
        System.out.println(particulas);
    }

}
