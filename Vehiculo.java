public abstract class Vehiculo {
    // Inserte acá los atributos
    public String nombreConductor;
    public int nPasajeros = 0;
    public int nMaximoPasajeros;
    public double cantidadDinero = 0;
    public double localizacionX = 0;
    public double localizacionY = 0;
    public boolean aireAcondicinadoActivado = false;
    public boolean motorEncendido = false;
    public boolean wifiEncendido = false;
    public boolean enMarcha = false;

    // Inserte acá el método constructor
    public Vehiculo(String nombreConductor, int nMaximoPasajeros) {
        this.nombreConductor = nombreConductor;
        this.nMaximoPasajeros = nMaximoPasajeros;
    }

    public Vehiculo(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    // Inserte acá los métodos (NO LOS GETTER Y SETTERS)

    public static void main(String[] args) {

        // Autobus a1 = new Autobus("Filomeno", 2);
        // a1.recogerPasajero(2);

        // a1.gestionarPuerta();
        // a1.gestionarMarcha();

        // a1.recogerPasajero(2);
        // a1.gestionarMarcha();
        // a1.gestionarPuerta();

        // a1.moverArriba(2);
        // a1.moverDerecha(5);
        // a1.gestionarWifi();
        // a1.gestionarAireAcondicionado();

        // a1.gestionarMotor();
        // a1.moverIzquierda(2);

        // System.out.println("nombre " + a1.nombreConductor + ", ");
        // System.out.println("dinero " + a1.cantidadDinero + ", ");
        // System.out.println("pasajeros " + a1.nPasajeros + ", ");
        // System.out.println("maxPasajeros " + a1.nMaximoPasajeros + ", ");
        // System.out.println("X " + a1.localizacionX + ", ");
        // System.out.println("Y " + a1.localizacionY + ", ");
        // System.out.println("puerta " + a1.puertaAbierta + ", ");
        // System.out.println("aire " + a1.aireAcondicinadoActivado + ", ");
        // System.out.println("motor " + a1.motorEncendido + ", ");
        // System.out.println("wifi " + a1.wifiEncendido + ", ");
        // System.out.println("marcha " + a1.enMarcha + ", ");

        Taxi b = new Taxi("Pepito");

        // b.gestionarMotor();
        // b.gestionarMarcha();
        // b.recogerPasajero();

        // b.gestionarMarcha();
        // b.recogerPasajero();
        // b.moverArriba(10);
        // b.moverDerecha(12);
        // b.gestionarSeguros();
        // b.moverAbajo(10);
        // b.moverIzquierda(13);

        // b.gestionarAireAcondicionado();
        // b.gestionarWifi();
        // b.gestionarMotor();
        // b.presionarBotonPanico();

        // a1.gestionarPuerta();
        // a1.recogerPasajero(1);
        // a1.recogerPasajero(3);
        // a1.recogerPasajero(6);
        // a1.gestionarMarcha();
        // a1.gestionarPuerta();
        // a1.gestionarMarcha();
        // a1.gestionarMotor();
        // a1.gestionarMarcha();
        // a1.moverArriba(1);
        // a1.moverIzquierda(2);
        // a1.moverAbajo(3);
        // a1.recogerPasajero(6);
        // a1.gestionarMarcha();
        // a1.gestionarPuerta();
        // a1.recogerPasajero(4);

        // b.gestionarMotor();
        // b.gestionarMarcha();
        // b.recogerPasajero();
        // b.gestionarMarcha();
        // b.recogerPasajero();
        // b.moverArriba(10);
        // b.moverDerecha(12);
        // b.gestionarSeguros();
        // b.moverAbajo(10);
        // b.moverIzquierda(13);
        // b.gestionarAireAcondicionado();
        // b.gestionarWifi();
        // b.gestionarMotor();
        // b.presionarBotonPanico();
        // b.dejarPasajero();

        b.gestionarMotor();
        b.recogerPasajero();
        b.gestionarSeguros();
        b.gestionarMarcha();
        b.moverAbajo(5);
        b.moverDerecha(6);
        b.moverIzquierda(2);
        b.gestionarSeguros();
        b.gestionarMarcha();
        b.dejarPasajero();
        b.dejarPasajero();
        b.gestionarSeguros();
        b.dejarPasajero();
        b.recogerPasajero();
        b.gestionarSeguros();
        b.moverArriba(1);
        b.gestionarMarcha();
        b.gestionarSeguros();
        b.dejarPasajero();

        System.out.println("nombre " + b.nombreConductor + ", ");
        System.out.println("dinero " + b.cantidadDinero + ", ");
        System.out.println("pasajeros " + b.nPasajeros + ", ");
        System.out.println("maxPasajeros " + b.nMaximoPasajeros + ", ");
        System.out.println("X " + b.localizacionX + ", ");
        System.out.println("Y " + b.localizacionY + ", ");
        System.out.println("aire " + b.aireAcondicinadoActivado + ", ");
        System.out.println("motor " + b.motorEncendido + ", ");
        System.out.println("wifi " + b.wifiEncendido + ", ");
        System.out.println("marcha " + b.enMarcha + ", ");
        System.out.println("distnacia " + b.calcularDistanciaAcopio() + ", ");
        /// System.out.println("puerta " + b.puertaAbierta + ", ");
        System.out.println("seguros " + b.segurosActivos + ", ");
        System.out.println("distancia recorrida " + b.distanciaRecorrida + ", ");

    }

    public void dejarPasajero() {

        nPasajeros -= 1;

    }

    // Retorna la distancia entre el origen de coordenadas y el punto
    // en el que se encuentra el vehículo
    public double calcularDistanciaAcopio() {
        double distancia = Math.sqrt((Math.pow((localizacionX - 0), 2)) + (Math.pow((localizacionY - 0), 2)));
        return distancia;
    }

    public void gestionarAireAcondicionado() {

        if (isMotorEncendido() && aireAcondicinadoActivado == false) {
            aireAcondicinadoActivado = true;
        } else {
            aireAcondicinadoActivado = false;
        }

    }

    public void gestionarMotor() {

        if (!isMotorEncendido()) {
            motorEncendido = true;
        } else {
            motorEncendido = false;
            aireAcondicinadoActivado = false;
            wifiEncendido = false;
            enMarcha = false;
        }

    }

    public void gestionarWifi() {

        if (isMotorEncendido() && !isWifiEncendido()) {
            wifiEncendido = true;
        } else {
            wifiEncendido = false;
        }

    }

    public abstract void gestionarMarcha();

    public void moverDerecha(double d) {
        if (isEnMarcha()) {
            localizacionX += d;
        }

    }

    public void moverIzquierda(double d) {
        if (isEnMarcha()) {
            localizacionX -= d;
        }

    }

    public void moverArriba(double d) {
        if (isEnMarcha()) {
            localizacionY += d;
        }

    }

    public void moverAbajo(double d) {
        if (isEnMarcha()) {
            localizacionY -= d;
        }

    }

    // Inserte acá los SETTERS Y GETTERS

    public String getNombreConductor() {
        return this.nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public int getNPasajeros() {
        return this.nPasajeros;
    }

    public void setNPasajeros(int nPasajeros) {
        this.nPasajeros = nPasajeros;
    }

    public int getNMaximoPasajeros() {
        return this.nMaximoPasajeros;
    }

    public void setNMaximoPasajeros(int nMaximoPasajeros) {
        this.nMaximoPasajeros = nMaximoPasajeros;
    }

    public double getCantidadDinero() {
        return this.cantidadDinero;
    }

    public void setCantidadDinero(double cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
    }

    public double getLocalizacionX() {
        return this.localizacionX;
    }

    public void setLocalizacionX(double localizacionX) {
        this.localizacionX = localizacionX;
    }

    public double getLocalizacionY() {
        return this.localizacionY;
    }

    public void setLocalizacionY(double localizacionY) {
        this.localizacionY = localizacionY;
    }

    public boolean isAireAcondicinadoActivado() {
        return this.aireAcondicinadoActivado;
    }

    public boolean getAireAcondicinadoActivado() {
        return this.aireAcondicinadoActivado;
    }

    public void setAireAcondicinadoActivado(boolean aireAcondicinadoActivado) {
        this.aireAcondicinadoActivado = aireAcondicinadoActivado;
    }

    public boolean isMotorEncendido() {
        return this.motorEncendido;
    }

    public boolean getMotorEncendido() {
        return this.motorEncendido;
    }

    public void setMotorEncendido(boolean motorEncendido) {
        this.motorEncendido = motorEncendido;
    }

    public boolean isWifiEncendido() {
        return this.wifiEncendido;
    }

    public boolean getWifiEncendido() {
        return this.wifiEncendido;
    }

    public void setWifiEncendido(boolean wifiEncendido) {
        this.wifiEncendido = wifiEncendido;
    }

    public boolean isEnMarcha() {
        return this.enMarcha;
    }

    public boolean getEnMarcha() {
        return this.enMarcha;
    }

    public void setEnMarcha(boolean enMarcha) {
        this.enMarcha = enMarcha;
    }

}