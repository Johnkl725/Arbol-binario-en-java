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
public class arbolBinario {
    public nodoArbol raiz;
    public arbolBinario(){
        raiz=null;
    }
    public void insertarNodo(int valor,String name){
        nodoArbol nuevo = new nodoArbol(valor,name);
        if(raiz==null){
            raiz=nuevo;
        }else{
            nodoArbol auxiliar=raiz;
            nodoArbol padre;
            while(true){
                padre=auxiliar;
                if(valor<auxiliar.valor){
                    auxiliar=auxiliar.hijoIzq;
                    if(auxiliar==null){
                        padre.hijoIzq=nuevo;
                        return;
                    }
                }else{
                    auxiliar=auxiliar.hijoDer;
                    if(auxiliar==null){
                        padre.hijoDer=nuevo;
                        return;
                    }
                }
            }
        }
    }
    public boolean estaVacio(){
        return raiz==null;
    }
    public void recorridoInorden(nodoArbol r){
        if(r!=null){
            recorridoInorden(r.hijoIzq);
            System.out.println(r.valor);
            recorridoInorden(r.hijoDer);
        }
    }
    public void recorridoPreorden(nodoArbol r){
        if(r!=null){
            System.out.println(r.valor);
            recorridoPreorden(r.hijoIzq);
            recorridoPreorden(r.hijoDer);
        }
    }
    public void recorridoPostorden(nodoArbol r){
        if(r!=null){
            recorridoPostorden(r.hijoIzq);
            recorridoPostorden(r.hijoDer);
            System.out.println(r.valor);
        }
    }
    public nodoArbol busquedaBinaria(int dato){
        nodoArbol auxiliar = raiz;
        while(auxiliar.valor!=dato){
            if(dato<auxiliar.valor){
                auxiliar=auxiliar.hijoIzq;
            }else{
                auxiliar=auxiliar.hijoDer;
            }
            if(auxiliar==null){
                return null;
            }
        }
        return auxiliar;
    }
}
