/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author AndreaS
 */
public class Empresa {

    private String nombre;
    private String id;
    private Gastos gastos;
    private Ingresos ingresos;
    
    public Empresa() {
    }

    public Empresa(String nombre, String id, Gastos gastos, Ingresos ingresos) {
        this.nombre = nombre;
        this.id = id;
        this.gastos = gastos;
        this.ingresos = ingresos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Gastos getGastos() {
        return gastos;
    }

    public void setGastos(Gastos gastos) {
        this.gastos = gastos;
    }

    public Ingresos getIngresos() {
        return ingresos;
    }

    public void setIngresos(Ingresos ingresos) {
        this.ingresos = ingresos;
    }

    @Override
    public String toString() {
        if ( gastos.calcularGastos()> ingresos.calcularIngresos() ){
            return "INFORME GENERAL DE LA EMPRESA : " + nombre +" ID :"+ id +"\n"+
               ingresos.calcularBalance()+ "\n" +
               gastos.calcularBalance() + "\n"+
               "Informe de contabilidad General : " + "\n" + 
               "Total de gastos   : " + gastos.calcularGastos()   + "\n"+
               "Total de Ingresos : " + ingresos.calcularIngresos() + "\n"+ 
               "Perdidas totales  : "+ (gastos.calcularGastos()-ingresos.calcularIngresos());
        }else{
            return "INFORME GENERAL DE LA EMPRESA : " + nombre +" ID :"+ id +"\n"+
               ingresos.calcularBalance()+ "\n" +
               gastos.calcularBalance()  + "\n"+
               "Informe de contabilidad General : " + "\n" + 
               "Total de gastos   : " + gastos.calcularGastos()   + "\n"+
               "Total de Ingresos : " + ingresos.calcularIngresos() + "\n"+ 
               "Ganacias totales  : "+ (ingresos.calcularIngresos()-gastos.calcularGastos());
        }
    }
    
    
    
}
