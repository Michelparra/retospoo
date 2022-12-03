package ficha;

import sena.Aprendiz;

public class Adso {
    public static void main(String[] args) {
        
        Aprendiz estudiante1 = new Aprendiz();
        estudiante1.nombre1 = "Usuario";

        estudiante1.registrar();

        estudiante1.cambiarNombre("Michel");
        estudiante1.calcularedad(2015);
        System.out.println("La edad del estudiante es "+estudiante1.edad);
    }
}
