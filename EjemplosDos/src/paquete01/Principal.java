/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import paquete02.DatoPersonal;
import paquete02.DatoTrabajo;
import paquete03.DatosUbicacion;
import paquete04.DatoAcademico;
import paquete05.DatoFinal;
import paquete06.Reporte;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        String nombre;
        String ciudad;
        String apellidoRetornado;
        String nombreEmpresa;
        String dirrecionEmpresa;
        
        double[] misNotas;
        double promedio;
        
        nombre = DatoPersonal.obtenerNombre();
        apellidoRetornado = DatoPersonal.obtenerApellido();
        ciudad = DatosUbicacion.obtenerCiudad();
        misNotas = DatoAcademico.obtenerNotas(4);
        promedio = DatoFinal.obtenerPromedio(misNotas);
        nombreEmpresa = DatoTrabajo.obtenerNombreEmpresa();
        dirrecionEmpresa = DatoTrabajo.obtenerDireccionEmpresa();
                
        
        Reporte.imprimir(nombre, apellidoRetornado, ciudad, nombreEmpresa, dirrecionEmpresa, misNotas, promedio);
        
    }
}
/* 

El problema debe recibir los datos personales como: Nombre, Apellido, Ciudad, Notas
cada dato debe ser obtenido en funciones diferentes e invocado en el main, luego
de haberlos importado.
Para la obtencion de Notas se debe crear una funcion donde se pregunten las notas
y se acumulen.
Con las notas obtenidas se calcula el promedio en una funcion diferente.
Finalmente con todos los datos se crea un informe.
*/
