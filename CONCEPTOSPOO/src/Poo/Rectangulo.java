package Poo;

public class Rectangulo extends Figura {
    //Atributos 
    private float Base, Lado;

    //Metodos
    public Rectangulo() {
    }

    public Rectangulo(float base, float lado) {
        Base = base;
        Lado = lado;
    }

    public float getBase() {
        return Base;
    }

    public void setBase(float base) {
        Base = base;
    }

    public float getLado() {
        return Lado;
    }

    public void setLado(float lado) {
        Lado = lado;
    }
    

    @Override
    public void calcularArea() {
        float area=Base*Lado;
        System.out.println("El area del rectangulo es "+area);

    }

    
}
