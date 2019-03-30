package modelo;

public class Productos implements Comparable<Productos>{ 
    
    private String nombre; 
    private int cantidad; 
    //constructor de la clase producto
    
    public Productos(String n, int c) { 
        nombre = n; 
        cantidad = c;
    }   


    public String toString(){ 
        return ("Nombre: "+nombre+" Cantidad: "+getCantidad()); 
    }    

    //métodos de encapsulamiento
    public String getNombre() { 
        return this.nombre;
    }
    
     public int getCantidad() {
        return cantidad;
    }
     
       public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public int compareTo(Productos o) {
      
        if (cantidad < o.getCantidad()) {
            
            return -1;
        }else if (cantidad > o.getCantidad()) {
            return 1;
        }
        return 0;
    } 
}//productos
