package paquete01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * Trabajo grupal hecho por: Adrian Guaman y Diego Torres
 */

import paquete02.Establecimiento;
import paquete03.Pedido;
import paquete03.Ubicacion;
import paquete04.Operacion;
import paquete05.Informe;
import paquete06.Reporte;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Declaro una variable arreglo de cadena y le doy el valor de la funcion obtenerCafeterias
        con el import del paquete establecimiento */
        String [] misCafeterias = Establecimiento.obtenerCafeterias();
        
        /* Declaro una variable arreglo de enteros y le doy el valor de la funcion obtenerPedidos
        con el import del paquete Pedido */
        int [][] misPedidos = Pedido.obtenerPedidos();
        
        /* Declaro una variable arreglo de cadenas y le doy el valor de la funcion obtenerUbicaciones
        con el import del paquete Ubicacion */
        String [] misSedes = Ubicacion.obtenerUbicaciones();
        
        /* Declaro una variable arreglo de decimales y le doy el valor de la funcion obtenerPromedioSemanal
        con el import del paquete Operacion */
        double [] promedioSemanal = Operacion.obtenerPromedioSemanal(misPedidos);
        
        /* Declaro una variable enter y le doy el valor de la funcion obtenerTotalDia
        con el import del paquete Informe */
        int pedidosMiercoles = Informe.obtenerTotalDia(misPedidos, 3);
        
        /* Declaro una variable entera y le doy el valor de la funcion sumaPedidosTotal
        con el import del paquete Operacion */
        int sumaPedidosTotal = Operacion.obtenerSumaTotal(misPedidos);
        
        /* Declaro una variable cadena y le doy el valor de la funcion cafeteriaMasPedida
        con el import del paquete Informe */
        String cafeteriaMasPedida = Informe.obtenerCafeteriaMasPedidos(misPedidos, misCafeterias);
        
        /* Declaro una variable entera y le doy el valor de la funcion pedidosMenores
        con el import del paquete Informe */
        int [] pedidosMenores = Informe.obtenerMenorPedidoCafeteria(misPedidos);
        
        /* Declaro una variable entera y le doy el valor de la funcion pedidosMayores
        con el import del paquete Informe */
        int [] pedidosMayores = Informe.obtenerMayorPedidoCafeteria(misPedidos);
        
        /* Finalmente llamo al procedimiento de imprimirReporte mediante el import de
        reporte donde mostrare el mensaje final 
        */
        Reporte.imprimirReporte(misCafeterias, misSedes, 
                promedioSemanal, 
                pedidosMenores, 
                pedidosMayores, 
                pedidosMiercoles, 
                cafeteriaMasPedida);
    }
    
}
