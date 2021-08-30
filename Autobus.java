public class Autobus extends Vehiculo {
    // ^ (Autobus hereda de Vehiculo)
    // Inserte acá los atributos
    public boolean puertaAbierta = false;

    // Inserte acá el método constructor

    public Autobus(String nombre, int maximoPasajeros) {
        super(nombre, maximoPasajeros);
    }

    // Inserte acá los métodos (NO LOS GETTER Y SETTERS)

    public void recogerPasajero(int estrato) {

        if (!isEnMarcha() && isPuertaAbierta() && nPasajeros < nMaximoPasajeros) {

            nPasajeros += 1;
            cantidadDinero += Autobus.calcularPasaje(estrato);

        }

    }

    public void dejarPasajero() {
        if (puertaAbierta = true && !isEnMarcha()) {

            nPasajeros -= 1;

        }

    }

    @Override
    public void gestionarMarcha() {

        if (!isMotorEncendido()) {
            enMarcha = false;

        } else if (!isEnMarcha() && !isPuertaAbierta()) {
            enMarcha = true;
        } else {
            enMarcha = false;
        }

    }

    public void gestionarPuerta() {

        if (!isPuertaAbierta() && !isEnMarcha()) {
            puertaAbierta = true;
        } else if (!isMotorEncendido()) {
            puertaAbierta = false;
        } else {
            puertaAbierta = false;
        }

    }

    public static double calcularPasaje(int estrato) {
        double pasaje = 0;
        switch (estrato) {
            case 0:
            case 1:
            case 2:
                pasaje = 1500;
                break;
            case 3:
            case 4:
                pasaje = 2600;
                break;
            case 5:
            case 6:
                pasaje = 3000;
            default:
                pasaje = 0;

        }
        return pasaje;

    }

    // Inserte acá los SETTERS Y GETTERS

    public boolean isPuertaAbierta() {
        return this.puertaAbierta;
    }

    public boolean getPuertaAbierta() {
        return this.puertaAbierta;
    }

    public void setPuertaAbierta(boolean puertaAbierta) {
        this.puertaAbierta = puertaAbierta;
    }

}