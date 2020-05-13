
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
        if(aniosmembresia>5)
        {
            p = p - p/2;
        }
        else if(aniosmembresia<5 && aniosmembresia>1)
        {
            p = p - p/10;
        }
        return p;
    }
    
}

