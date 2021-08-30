public class Taxi extends Vehiculo {

    // ^ (Taxi hereda de Vehiculo)
    // Inserte acá los atributos
    public double distanciaRecorrida = 0;
    public boolean segurosActivos = false;
    public int nMaximoPasajeros = 1;
    // Inserte acá el método constructor

    public Taxi(String nombreConductor) {
        super(nombreConductor);
    }

    // Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void reiniciarTaximetro() {
        distanciaRecorrida = 0;

    }

    public void presionarBotonPanico() {
        enMarcha = false;
        segurosActivos = false;
        cantidadDinero -= this.calcularPasaje();
    }

    @Override
    public void dejarPasajero() {
        if (nPasajeros > 0 && !isSegurosActivos()) {

            nPasajeros -= 1;

        }
        cantidadDinero += this.calcularPasaje();

        reiniciarTaximetro();

    }

    public void recogerPasajero() {
        if (nPasajeros < 1) {

            nPasajeros += 1;
        }
    }

    public void gestionarSeguros() {
        if (!isEnMarcha() && isSegurosActivos()) {
            segurosActivos = false;
        } else {
            segurosActivos = true;
        }
    }

    public double calcularPasaje() {

        double pasaje = 0;

        if (distanciaRecorrida > 0) {

            pasaje = 3000 + (2300 * distanciaRecorrida);
        }
        return pasaje;

    }

    @Override
    public void moverDerecha(double d) {
        if (isEnMarcha() && nPasajeros == 1) {
            localizacionX += d;
            distanciaRecorrida += d;
        }

    }

    public void moverIzquierda(double d) {
        if (isEnMarcha() && nPasajeros == 1) {
            localizacionX -= d;
            distanciaRecorrida += d;
        }

    }

    public void moverArriba(double d) {
        if (isEnMarcha() && nPasajeros == 1) {
            localizacionY += d;
            distanciaRecorrida += d;
        }

    }

    public void moverAbajo(double d) {
        if (isEnMarcha() && nPasajeros == 1) {
            localizacionY -= d;
            distanciaRecorrida += d;
        }

    }

    @Override
    public void gestionarMarcha() {
        if (!isEnMarcha() && isSegurosActivos()) {
            enMarcha = true;
        } else {
            enMarcha = false;
        }

    }
    // Inserte acá los SETTERS Y GETTERS

    public double getDistanciaRecorrida() {
        return this.distanciaRecorrida;
    }

    public void setDistanciaRecorrida(double distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }

    public boolean isSegurosActivos() {
        return this.segurosActivos;
    }

    public boolean getSegurosActivos() {
        return this.segurosActivos;
    }

    public void setSegurosActivos(boolean segurosActivos) {
        this.segurosActivos = segurosActivos;
    }

}