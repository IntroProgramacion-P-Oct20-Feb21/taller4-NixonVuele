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
public class Ejercicio3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // declaro las variables
        double costoMinuto;
        int minutosConsumidos;
        double costoTotal;
        // pido datos por teclado - entradas
        System.out.println("Ingrese cuanto cuesta usar el telefono por minuto");
        costoMinuto= entrada.nextDouble();
        System.out.println("Ingrese los minutos consumido del telefono");
        minutosConsumidos = entrada.nextInt();
        // proceso
        costoTotal= costoMinuto * minutosConsumidos;
        // salida
        System.out.printf("El costo total es: %.2f $\n",
                costoTotal);
    }
}

