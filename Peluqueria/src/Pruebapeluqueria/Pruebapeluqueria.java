
package Pruebapeluqueria;

import Perro.Perro;
import peluqueria.Peluqueria;


public class Pruebapeluqueria {
    
    public static void main(String[] args){
        Perro perro01 = new Perro();
        perro01.setNombre("snoopy");
        perro01.setPelo(Boolean.FALSE);
        Peluqueria p = new Peluqueria();
        p.cortarPelo(perro01);
        System.out.println(perro01);
    }
}
