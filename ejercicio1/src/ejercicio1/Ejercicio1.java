/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author Laboratorio
 */
import java.util.Scanner; //llamando la funcion scanner
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
           //pedir el nombre y mostramos el mensaje de saludo
          //para crear variable primero ponemos tipo de dato y luego nombre variable 
          String Nombre;
          //llamar al scanner para guardar en la variable 
          Scanner guardar= new Scanner(System.in);
          //vamos a pedir la informacion
          System.out.println("Ingrese su nombre");
          //guardar el dato en la variable
          Nombre=guardar.nextLine();
          //guardar: variable = comose llamo el scanner.nexttipodedato
          //mostrar la solucion(parametro de salida
          System.out.println("Hola "+ Nombre + " bienvenido");
    }
    
}
