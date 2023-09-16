/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int contador = 0;
        int numero = 0;
        
        
        
        System.out.println("Ingresa un numero");
        
        while (true) {
            numero = scanner.nextInt();
            
            if (numero == -1) {
            break;
        }
            
        if (numero > 0) {
            suma += numero;
            contador ++;
        }else{
            System.out.println("ERROR : Ingrese un numero entero positivo (Si no, ingresa -1 para terminar)");
        }
        }
        scanner.close();
        
        if (contador > 0) {
            double promedio = (double) suma/contador;
        
            System.out.println("La suma de los " + contador + " números ingresados es " + suma);
            System.out.println("El promedio de los " + contador + "numeros ingresador es" + promedio);
        }else{
            System.out.println("No se ingresaron numeros validos");
        }
        
        }
        
    }
        
        
        
    
    
    
    
         
