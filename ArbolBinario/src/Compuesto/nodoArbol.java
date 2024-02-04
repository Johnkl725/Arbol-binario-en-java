/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compuesto;

/**
 *
 * @author John
 */
public class nodoArbol {
    public int valor;
    public String nombre;
    public nodoArbol hijoIzq;
    public nodoArbol hijoDer;
    public nodoArbol(int dato,String name){
        this.valor=dato;
        this.nombre=name;
        hijoIzq=null;
        hijoDer=null;
    }
    public String toString(){
        return nombre + "\nsu valo es -->"+ valor;
    }
}
