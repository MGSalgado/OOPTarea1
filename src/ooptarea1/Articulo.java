/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptarea1;

/**
 *
 * @author Miguel
 */
public class Articulo {
    
    public int sku;
    protected int existencia;
    protected double precio;
    protected double costo;
    public String descripcion;
    
    //Constructor
    
    public Articulo (int sku, double precio, String descripcion){
        this.sku=sku;
        this.precio=precio;
        this.descripcion=descripcion;
    
    }
    
    //Metodos
    public void compra(int existencia, double costo){
        this.existencia=existencia;
        this.costo=costo;
    }
    
    public boolean venta(int existencia){
        if(this.existencia>existencia){
            this.existencia=this.existencia-existencia;
            return true;
        }else{return false;
        }
    }

    
    public int verificarExistencia(){
        return existencia;
    }
    
    public void actualizaPrecio(double precio){
        this.precio=precio;
    }
    
}
