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
public class Ejercicio1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1.Inicio
        // declaro las variables
       Scanner entrada = new Scanner(System.in);
       entrada.useLocale(Locale.US);
       //2.base, d[0,n]
       double base;
       //3.altura, d[0,n]
       double altura;
       //4.areaTriangulo, d[0,n]
       double areaTriangulo;
       // pido datos por teclado - entradas
       //5.Escribir "Ingrese la base"
       System.out.println("Ingrese la base");
       //6.Leer base
       base = entrada.nextDouble();
       //7. Escribir "Ingrese la altura"
       System.out.println("Ingrese la altura");
       //8. Leer altura
       altura= entrada.nextDouble();
       // proceso
       //9. areaTriangulo <-- base * altura/2
       areaTriangulo = (base * altura)/2;
       // salida
       //10. Escribir "El area del triangulo es:" + areaTriangulo
       System.out.printf("El area del triangulo es: %.2f metros3\n",
               areaTriangulo);
    }//11. Fin
}