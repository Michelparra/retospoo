package Poo;

public class Triangulo extends Figura{
    //Atributos
    private float Base, Altura ;

    //Metodos
    public Triangulo() {
    }

    public Triangulo(float base, float altura) {
        Base = base;
        Altura = altura;
    }
    

    public float getBase() {
        return Base;
    }

    public void setBase(float base) {
        Base = base;
    }

    public float getAltura() {
        return Altura;
    }

    public void setAltura(float altura) {
        Altura = altura;
    }

    @Override
    public void calcularArea() {
        float area=Base*Altura/2;
        System.out.println("El area del triangulo es "+area);
    
    }

}
