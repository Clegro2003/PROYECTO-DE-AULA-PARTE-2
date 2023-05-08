/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author AndreaS
 */
public class Ingresos implements Balance  {
    
    private int numVentasProductoA;
    private int numVentasProductoB;
    private int numVentasProductoC;

    public Ingresos() {
    }

    public Ingresos(int cantProductoA, int cantProductoB, int cantProductoC) {
        this.numVentasProductoA = cantProductoA;
        this.numVentasProductoB = cantProductoB;
        this.numVentasProductoC = cantProductoC;
    }
    
    @Override
    public String calcularBalance(){
        
        double ventasProductoA =Balance.Venta_Producto_A * numVentasProductoA ;
        double ventasProductoB =Balance.Venta_Producto_B * numVentasProductoB ;
        double ventasProductoC =Balance.venta_Producto_C * numVentasProductoC ;
        
        return "Informe detallado de ingresos " + "\n" + " " + "\n" +
                
               "Numero de productos A vendidos : " +numVentasProductoA+"\n" +
               "Ingresos por producto A : " +ventasProductoA + "\n" + " " + "\n" +
                
               "Numero de productos B vendidos : " +numVentasProductoB+"\n" +
               "Ingresos por producto B : " +ventasProductoB + "\n" + " " + "\n" +
                
               "Numero de productos C vendidos : " +numVentasProductoC+"\n" +
               "Ingresos por producto C : " +ventasProductoC;
    }
    
    
    public double calcularIngresos(){
        double ventasProductoA =Balance.Venta_Producto_A * numVentasProductoA ;
        double ventasProductoB =Balance.Venta_Producto_B * numVentasProductoB ;
        double ventasProductoC =Balance.venta_Producto_C * numVentasProductoC ;
        double ingresoTotal= ventasProductoA+ventasProductoB+ventasProductoC;
        
        return ingresoTotal;
    }
}
