package Poo;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            int op;
            float num1, num2;
            System.out.println("Menú opciones \n 1.Cuadrado \n 2. Rectangulo \n 3.Triangulo \n 4.Circulo \n Ingrese el numero de la opcion que desea ejecutar");
            op=leer.nextInt();

                switch(op){
                    case 1:
                    System.out.println("Ingrese el lado");
                    num1=leer.nextInt();
                    Cuadrado c1=new Cuadrado();
                    c1.setLado(num1);
                    c1.calcularArea();

                    case 2:
                    System.out.println("Ingrese la base");
                    num1=leer.nextInt();
                    System.out.println("Ingrese la altura");
                    num2=leer.nextInt();
                    Triangulo t1=new Triangulo();
                    t1.setBase(num1);
                    t1.setAltura(num2);
                    t1.calcularArea();

                    case 3:
                    System.out.println("Ingrese la base");
                    System.out.println("Ingrese el lado");
                    num1=leer.nextInt();
                    num2=leer.nextInt();
                    Rectangulo r1=new Rectangulo();
                    r1.setBase(num1);
                    r1.setLado(num2);
                    r1.calcularArea();

                    case 4:
                    System.out.println("Ingrese el radio");
                    num1=leer.nextInt();
                    Circulo cr1=new Circulo();
                    cr1.setRadio(num1);
                    cr1.calcularArea();
                }
        }
    }
}
