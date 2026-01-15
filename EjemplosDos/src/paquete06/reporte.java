/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

/**
 *
 * @author UTPL
 */
public class Reporte {
    public static void imprimir(String nombre, String apellido, String ciudad, 
            String nombreEmpresa, String dirrecionEmpresa, double [] notas, double promedio){
        
        String reporteFinal;
        String reporteNotas="";
        for(int i =0; i < notas.length;i++){
            reporteNotas = String.format("\n%s%.2f\n",reporteNotas,notas[i]);
        }
        reporteFinal = String.format("\nLos datos ingresados son:\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Ciudad: %s\n"
                + "Nombre Empresa: %s\n"
                + "Direccion Empresa:%s\n"
                + "Notas: %s\n"
                + "Promedio: %.2f\n",
                nombre,
                apellido,
                ciudad,
                nombreEmpresa,
                dirrecionEmpresa,
                reporteNotas,
                promedio);
        System.out.printf("%s\n",reporteFinal);
    }
    
}
