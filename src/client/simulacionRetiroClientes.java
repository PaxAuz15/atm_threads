package src.client;

import src.model.Cuenta;
import src.app.TitularDeLaCuenta;

public class simulacionRetiroClientes{
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        TitularDeLaCuenta titularDeLaCuenta = new TitularDeLaCuenta(cuenta);
        Thread hilo1 = new Thread(titularDeLaCuenta);
        Thread hilo2 = new Thread(titularDeLaCuenta);
        Thread hilo3 = new Thread(titularDeLaCuenta);

        hilo1.setName("Rosado");
        hilo2.setName("Dannes");
        hilo3.setName("Alberto");

        hilo1.start();
        hilo2.start();
        hilo3.start();
    }        
}
