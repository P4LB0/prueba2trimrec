
package EXAMENRECUPERACION2;

public class PasajeroNosocio extends Pasajero
{

    public PasajeroNosocio(int edad, String nombre) {
        super(edad, nombre);
    }

    @Override
    public double aplicadescuento(double p) 
    {
        if(edad> 65)
        {
          p = p - p/10;
        }
        return p;
    }
}
