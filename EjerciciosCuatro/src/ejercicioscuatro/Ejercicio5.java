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
public class Ejercicio5 {
    //Inicio
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // declaro las variables
        double cantidadPrestamo;
        double pagoMensual;
        double interesMensual;
        int plazo=12;
        // pido datos por teclado - entradas
        System.out.println("Ingrese la cantidad del prestamo a pedir");
        cantidadPrestamo= entrada.nextDouble();
        System.out.println("Cual es el interes mensual a cobrar?");
        interesMensual= entrada.nextDouble();
        // proceso
        pagoMensual = (cantidadPrestamo/plazo) + interesMensual;
        // salida
        System.out.printf("El valor a pagar mensualmente del prestamo con 1 año de plazo es: %.2f $\n",
                pagoMensual);
    }//Fin
}