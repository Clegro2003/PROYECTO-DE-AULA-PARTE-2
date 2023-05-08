
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author AndreaS
 */
public class Gastos implements Balance  {
    
    private int numTrabajadores    ;
    // numero de productos comprados para mantener el inventario
    private int numComprasProductoA;
    private int numComprasProductoB;
    private int numComprasProductoC;

    public Gastos() {
    }

    public Gastos(int numTrabajadores, int numComprasProductoA, int numComprasProductoB, int numComprasProductoC) {
        this.numTrabajadores = numTrabajadores;
        this.numComprasProductoA = numComprasProductoA;
        this.numComprasProductoB = numComprasProductoB;
        this.numComprasProductoC = numComprasProductoC;
    }
    
    
    
    @Override
    public String calcularBalance(){
        
        double sueldoEmpleados = Balance.sueldoTrabajadores * numTrabajadores;
        double comprasProductoA =Balance.Producto_Calidad_A * numComprasProductoA ;
        double comprasProductoB =Balance.producto_Calidad_B * numComprasProductoB ;
        double comprasProductoC =Balance.Producto_Calidad_C * numComprasProductoC ;
        double gastoTotal = sueldoEmpleados + comprasProductoA + comprasProductoB + comprasProductoC;
        
        return "Informe detallado de Gastos " + "\n" + " " + "\n" +
                
               "Numero de empleados contratados :" + numTrabajadores + "\n" +
               "Gastos por nomina : " + sueldoEmpleados + "\n" +" " + "\n" +
                
               "Numero de productos A Comprados : " +numComprasProductoA+"\n" +
               "Gastos por producto A : " +comprasProductoA + "\n" + " " + "\n" +
                
               "Numero de productos B Comprados : " +numComprasProductoB+"\n" +
               "Gastos por producto B : " +comprasProductoB + "\n" + " " + "\n" +
                
               "Numero de productos C Comprados : " +numComprasProductoC+"\n" +
               "Gastos por producto C : " +comprasProductoC;
                          
    }
    
    public double calcularGastos(){
        double sueldoEmpleados = Balance.sueldoTrabajadores * numTrabajadores;
        double comprasProductoA =Balance.Producto_Calidad_A * numComprasProductoA ;
        double comprasProductoB =Balance.producto_Calidad_B * numComprasProductoB ;
        double comprasProductoC =Balance.Producto_Calidad_C * numComprasProductoC ;
        double gastoTotal = sueldoEmpleados + comprasProductoA + comprasProductoB + comprasProductoC;
        
        return gastoTotal;
    }
    
}
