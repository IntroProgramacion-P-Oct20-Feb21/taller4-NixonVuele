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
public class Ejercicio2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // declaro las variables
        double primerHijo;
        double segundoHijo;
        double tercerHijo;
        double gastosTotales;
        // pido datos por teclado - entradas
        System.out.println("Ingrese los gastos del primer hijo");
        primerHijo= entrada.nextDouble();
        System.out.println("Ingrese los gastos del segundo hijo");
        segundoHijo= entrada.nextDouble();
        System.out.println("Ingrese los gastos del tercer hijo");
        tercerHijo= entrada.nextDouble();
        // proceso
        gastosTotales = tercerHijo + segundoHijo + tercerHijo;
        // salida
        System.out.printf("Los gastos totales de todos los hijos son: %.2f $\n",
                gastosTotales);
    }
}
