package Juego;

import java.util.Random;
import java.util.Scanner;

public class Carisellazo implements Juego1 {
    //atributos
    private String nombre;
    private int eleccion;
    private int moneda;
    Scanner leer=new Scanner(System.in);

    @Override
    public void iniciar() {
        System.out.println("Ingrese el nombre del jugador");
            nombre=leer.nextLine();

    }
    @Override
    public void jugar() {
        System.out.println("Escoge 1 para cara o 2 para sello");
        eleccion=leer.nextInt();
        System.out.println("......La moneda esta girando......");
        Random aleatorio=new Random();
        moneda=aleatorio.nextInt(2)+1;
    }
    
    @Override
    public void finalizar() {
        if(moneda==1 && eleccion==1){
        System.out.println("Cayó cara, seleccionaste cara. !Ganaste! "+nombre);
    }

        else if (moneda==1 && eleccion==2){
            System.out.println("Cayó cara, seleccionaste sello. !Perdiste! "+nombre);
        }
        
        else if (moneda==2 && eleccion==2){
            System.out.println("Cayó sello, seleccionaste sello. !Ganaste! "+nombre);
        }
        
        else if (moneda==2 && eleccion==1){
            System.out.println("Cayó sello, seleccionaste cara. !Perdiste! "+nombre);
        }
        
    }

    

    
}
