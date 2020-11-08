/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscuatro;

/**
 *
 * @author reroes
 */
import java.util.Locale;
import java.util.Scanner;
public class Ejercicio4 {
    //Inicio
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // declaro las variables
        double costoCpu;
        double costoTeclado;
        double costoPantalla;
        double costoRaton;
        double costoTotal;
        // pido datos por teclado - entradas
        System.out.println("Ingrese el valor del CPU");
        costoCpu= entrada.nextDouble();
        System.out.println("Ingrese el valor del teclado");
        costoTeclado= entrada.nextDouble();
        System.out.println("Ingrese el valor del pantalla");
        costoPantalla= entrada.nextDouble();
        System.out.println("Ingrese el valor del raton");
        costoRaton= entrada.nextDouble();
        // proceso
        costoTotal = costoCpu + costoTeclado + costoPantalla+costoRaton;
        // salida
        System.out.printf("El costo total de la computadora es: %.2f $\n",
                costoTotal);
    }//Fin
}