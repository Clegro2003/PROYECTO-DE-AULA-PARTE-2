/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelo;

/**
 *
 * @author AndreaS
 */
public interface Balance {
    
    // Gastos comunes en una empresa
    
        double sueldoTrabajadores = 516000 ;
        // Se utilizaran 3 tipos de productos como base en el inventario de la empresa.
        // El precio del producto sera definido por la calidad. 
        double Producto_Calidad_A = 12000 ;
        double producto_Calidad_B = 8000;
        double Producto_Calidad_C = 5000;
        
    // Ingresos de la empresa
        
        // Precio de venta de los productos 
        double Venta_Producto_A = 25000;
        double Venta_Producto_B = 18000;
        double venta_Producto_C = 12000;
        
        
  String calcularBalance();
}
