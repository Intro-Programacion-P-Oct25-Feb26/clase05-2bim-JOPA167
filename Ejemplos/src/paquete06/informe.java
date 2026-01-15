/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

/**
 *
 * @author UTPL
 */
public class informe {
    public static void imprimir (int a, int b , int c, int d){
        String reporteFinal;
        reporteFinal = String.format("La suma de %d + %d es igual a: %d\n"
                + "La multiplicación de %d * %d es igual a %d \n",a,b,c,a,b,d);
        System.out.printf("%s",reporteFinal);
    }
    
}
