
package peluqueria;
import Perro.Perro;
import Pruebapeluqueria.Pruebapeluqueria;

public class Peluqueria {

public void cortarPelo(Perro p) {
    if(p.getPelo()){
        p.setPelo(Boolean.FALSE);
    } else {
        System.out.println("nada que cortar");
        }
      }
}
