package Aritmeticas;

import java.util.Scanner;

public class calculadora {
    
    //  Atributos
    public int num1;
    public int num2;
    public int resultado;

    //Metodos

    //1.Metodos sin valor de retorno que sume los dos numeros

    public void Sumadenumeros(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Registre el primer numero que desea sumar");
        num1=leer.nextInt();
        System.out.println("Registre el segundo numero que desea sumar");
        num2=leer.nextInt();
        resultado=num1+num2;
        System.out.println("El resultado de la suma de los dos numeros es" +resultado);

        leer.close();

    }

    //2.Metodo con valor de retorno que reste los dos numeros

    //3.Metodo con valor de retorno que devuelva ¿Cual es el numero mayor?

    //4.Metodo sin valor de retorno que devuelva ¿Cual es el numero menor?

    //5.Metodo con valor de retorno qu eleve cada numero al exponente  que sea indicado por el usuario

    
}
