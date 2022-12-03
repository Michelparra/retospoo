package Retos.Salud;

import java.util.Scanner;

public class persona {
    //atributos
    public String tipoDoc;
    public String documento;
    public String nombre;
    public String apellido;
    public int peso;
    public int estatura;
    public int edad;
    public String sexo;
    public double pesoActual;



    //metodos
    public void pedirDatos(){
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese el tipo de documento");
        tipoDoc=leer.nextLine();
        System.out.println("ingrese el numero");
        documento=leer.nextLine();
        System.out.println("ingrese su nombre");
        nombre=leer.nextLine();
        System.out.println("ingrese su apellido");
        apellido=leer.nextLine();
        System.out.println("ingrese su peso en kilogramos");
        peso=leer.nextInt();
        System.out.println("ingrese su estatura");
        estatura=leer.nextInt();
        System.out.println("ingrese su edad");
        edad=leer.nextInt();
        System.out.println("ingrese su sexo");
        sexo=leer.next();

        leer.close();
    }
    public void mostrarPersona(){
        System.out.println("su tipo de de documento es \n"+tipoDoc+" con el numero \n "+documento+" \n "+nombre+" \n "+apellido+"\n"+peso+" \n "+estatura+" \n "+edad+" \n "+sexo);
    }

    public void calcularlmc() {

        pesoActual = peso / estatura;
        Math.pow(estatura, 2);

        if (peso < 20) {
            System.out.println("peso bajo");

        } else if (peso > 20 && peso < 25) {
            System.out.println("peso ideal");

        } else if (peso > 25) {

            System.out.println("sobrepeso");
        }

    }

    public void mayorEdad() {
        
        if (edad<18){
            System.out.println("menor de edad");
        }

        else if (edad>=18){
            System.out.println("mayor de edad");
        }
    }
}