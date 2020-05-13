
package EXAMENRECUPERACION2;

public class Vuelo 
{
    int numVuelo;
    String origen;
    String destino;
    int capacidad;
    int numAsientosQueFaltan;
    double precioOriginal;

    public Vuelo(int numVuelo, String origen, String destino, int capacidad, int numAsientosQueFaltan, double precioOriginal) {
        this.numVuelo = numVuelo;
        this.origen = origen;
        this.destino = destino;
        this.capacidad = capacidad;
        this.numAsientosQueFaltan = numAsientosQueFaltan;
        this.precioOriginal = precioOriginal;
    }

    public int getNumVuelo() {
        return numVuelo;
    }

    public void setNumVuelo(int numVuelo) {
        this.numVuelo = numVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getNumAsientosQueFaltan() {
        return numAsientosQueFaltan;
    }

    public void setNumAsientosQueFaltan(int numAsientosQueFaltan) {
        this.numAsientosQueFaltan = numAsientosQueFaltan;
    }

    public double getPrecioOriginal() {
        return precioOriginal;
    }

    public void setPrecioOriginal(double precioOriginal) {
        this.precioOriginal = precioOriginal;
    }
    
    
}
