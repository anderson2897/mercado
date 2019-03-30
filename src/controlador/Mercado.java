
package controlador;


import java.util.*; 
import modelo.Productos;
public class Mercado {
    
    public static void main(String args[]){ 
        Productos gaseosa = new Productos("gaseosa", 6); 
        Productos paquetes = new Productos("paquetes", 2); 
        Productos manzanas = new Productos("manzanas", 5); 
        Productos lentejas = new Productos("lentejas", 2); 
        Productos aceite = new Productos("aceite", 2); 
        // Definir un ArrayList llamado lista
        ArrayList lista = new ArrayList(); 
        lista.add(gaseosa); 
        lista.add(paquetes); 
        lista.add(manzanas); 
        lista.add(lentejas); 
        lista.add(1, aceite); 
        lista.add(aceite); 
        
        System.out.println(" Lista del mercado con " + lista.size() + 
        " productos"); 

        Iterator it = lista.iterator();
        while ( it.hasNext() ) { 
            
            Object objeto = it.next(); 
            Productos producto = (Productos)objeto; 
            System.out.println(producto); 
        } 
        
        lista.remove(2); 
        System.out.println(" Lista del mercado con " + lista.size() + " productos"); 

        Iterator it2 = lista.iterator(); 
        while ( it2.hasNext() ) { 
            Productos producto = (Productos)it2.next(); 
            System.out.println(producto);
        } 
        
        lista.sort(null);
       
        System.out.println(" lista ordenada");
        
        Iterator it3 = lista.iterator(); 
        while ( it3.hasNext() ) { 
            Productos producto = (Productos)it3.next(); 
            System.out.println(producto);
        } 
        
       lista.clear();
        System.out.println(" Lista del mercado con " + lista.size() +" productos");
    }//main
}//Mercado