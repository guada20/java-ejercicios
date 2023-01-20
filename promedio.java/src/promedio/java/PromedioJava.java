/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promedio.java;

/**
 *
 * @author Laboratorio
 */
import java.util.Scanner;
public class PromedioJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          //crear un programa que pida 3 notas y muestre el promedio
    //crea las variables
    String Nombre;
    float nota1, nota2, nota3,promedio;
    //llamar el scanner 
    Scanner Lea = new Scanner(System.in);
    //pedir los datos de entrada
    System.out.println("Ingrese el nombre del estudiante");
    Nombre=Lea.nextLine();
    System.out.println("Ingrese el valor de la primera nota");
    nota1=Lea.nextFloat();
    System.out.println("Ingrese el valor de la segunda nota");
    nota2=Lea.nextFloat();
    System.out.println("Ingrese el valor de la tercera nota");
    nota3=Lea.nextFloat();
    //proceso
    promedio = (nota1+nota2+nota3)/3;
    //mostrar  el resultado 
    System.out.println("El estudiante " +Nombre+ " tiene un promedio de: " +promedio);
         //comparar si gano o perdio la materia  
      
    if(promedio>=3.0){
        System.out.println("El estudiante " +Nombre+ " ganó la materia, con un promedio de " +promedio);
    }
    else{
        System.out.println("El estudiante " +Nombre+ " perdió la materia, con un promedio de "+promedio);
    }
    }
    
  
    
    
}
