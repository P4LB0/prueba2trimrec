
package EXAMENRECUPERACION2;

public interface OperacionesVuelos 
{
    public void crearVuelos();
    public void muestraVuelosDisponibles(String origen,String destino);
    public Vuelo getVuelo (int numVuelo);
    public void reservaAsiento(int numVuelo,Pasajero p);
}
