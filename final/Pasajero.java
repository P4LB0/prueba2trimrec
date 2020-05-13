
package EXAMENRECUPERACION2;

public abstract class Pasajero 
{
  String nombre;
  int edad;
  
  public Pasajero(int edad , String nombre)
  {
      this.edad = edad;
      this.nombre = nombre;
  }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
  public abstract double aplicadescuento(double p);
  

}
