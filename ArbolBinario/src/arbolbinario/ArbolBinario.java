/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

import Compuesto.arbolBinario;
import javax.swing.JOptionPane;

/**
 *
 * @author John
 */
public class ArbolBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion=0,elemento;
        String nombre;
        arbolBinario arbol = new arbolBinario();
        do{
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar un nodo\n"
                                + "2.Recorrido Inorden\n"
                                + "3.Recorrido Preorden\n"
                                + "4.Recorrido Postorden\n"
                                + "5.Buscar nodo\n"
                                + "6.Salir\n"
                                + "Elige Una Opcion...","Arboles binarios",JOptionPane.QUESTION_MESSAGE));
                switch(opcion){
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el Numero del nodo...","Agregando Nodo",JOptionPane.QUESTION_MESSAGE));
                        nombre = JOptionPane.showInputDialog(null,
                                "Ingresa el nombre del nodo...","Agregando Nodo",JOptionPane.QUESTION_MESSAGE);
                        arbol.insertarNodo(elemento, nombre);
                        break;
                    case 2:
                        if(arbol.estaVacio()){
                           JOptionPane.showMessageDialog(null, "El arbol está vacío",
                                "!Cuidado",JOptionPane.INFORMATION_MESSAGE); 
                        }else{
                            arbol.recorridoInorden(arbol.raiz);
                        }
                        break;
                    case 3:
                        if(arbol.estaVacio()){
                           JOptionPane.showMessageDialog(null, "El arbol está vacío",
                                "!Cuidado",JOptionPane.INFORMATION_MESSAGE); 
                        }else{
                            arbol.recorridoPreorden(arbol.raiz);
                        }
                        break;
                    case 4:
                        if(arbol.estaVacio()){
                           JOptionPane.showMessageDialog(null, "El arbol está vacío",
                                "!Cuidado",JOptionPane.INFORMATION_MESSAGE); 
                        }else{
                            arbol.recorridoPostorden(arbol.raiz);
                        }
                        break;
                    case 5:
                        if(arbol.estaVacio()){
                           JOptionPane.showMessageDialog(null, "El arbol está vacío",
                                "!Cuidado",JOptionPane.INFORMATION_MESSAGE); 
                        }else{
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el Numero a buscar...","Agregando Nodo",JOptionPane.QUESTION_MESSAGE));
                            JOptionPane.showMessageDialog(null, "Nodo encontrado!!!",
                                    "Encontrado",JOptionPane.INFORMATION_MESSAGE);
                            JOptionPane.showMessageDialog(null, arbol.busquedaBinaria(elemento));
                        }
                        break;     
                    case 6:
                        JOptionPane.showMessageDialog(null, "App finalizada",
                                "Fin",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    
                }
                System.out.println("");     
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null,"Error "+ n.getMessage());
            }
        }while(opcion!=6);
    }
    
}
