
package EXAMENRECUPERACION2;

public class PasajeroSocio extends Pasajero
{
    int aniosmembresia;

    public PasajeroSocio(int aniosmembresia, int edad, String nombre) {
        super(edad, nombre);
        this.aniosmembresia = aniosmembresia;
    }
    
    

    @Override
    public double aplicadescuento(double p) 
    {
        
    }
}

