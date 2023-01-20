/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Laboratorio
 */
import java.util.Scanner;
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //descuento por compra 
        String Nombre;
        float ValorCompra;
        float DCTO1;
        float DCTO2;
        float Total1;
        float Total2;
              
        
        Scanner Lea = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        Nombre=Lea.nextLine();
        System.out.println("Ingrese el valor de la compra");
        ValorCompra=Lea.nextFloat();
        
        if(ValorCompra > 300.000){
            DCTO1 = (ValorCompra)*(20/100);
           Total1 = (ValorCompra-DCTO1);
           System.out.println("Hola" +Nombre+ "Su descuento es " +DCTO1);
           System.out.println(Nombre+ " El total de tu factura es " +Total1);
        }else{
            DCTO2 = (ValorCompra)*(10/100);
            Total2 = (ValorCompra-DCTO2);
            System.out.println("Hola" +Nombre+ "Su descuento es " +DCTO2);
           System.out.println(Nombre+ " El total de tu factura es " +Total2);
        }
        
           
    }
    
}
