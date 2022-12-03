package Poo;

public class Circulo extends Figura {
    //Atributos
    private float radio;

    public Circulo() {
    }
    
    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    //Metodos
    @Override
    public void calcularArea() {
        double pi=3.1416;
        double radio1=Math.pow(radio, 2);
        double area=pi*radio1;
        System.out.println("El area del circulo es "+area);
    }

    
    
}
