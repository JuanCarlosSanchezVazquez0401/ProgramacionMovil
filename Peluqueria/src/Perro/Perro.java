
package Perro;
//import peluqueria.Peluqueria;
//import Pruebapeluqueria.Pruebapeluqueria;



public class Perro {
    
    String nombre;
    Boolean pelo;
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPelo(Boolean pelo) {
        this.pelo = pelo;
    }

    public String getNombre() {
        return nombre;
    }

    public Boolean getPelo() {
        return pelo;
    }
    
    @Override
    public String toString(){
        return "Perro(" + "nombre=" + nombre + ", peludo=" + pelo + ')'; 
    }
    
}
