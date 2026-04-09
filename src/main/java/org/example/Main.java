package org.example;

import org.example.*;

public class Main {
    public static void main(String[] args) {

        Vehiculo v1 = new Vehiculo("#8888", 2020, false);
        v1.liberar();

        Conductor c1 = new Conductor("Checho", 1234);
        c1.asignarVehiculo(v1);

        Pasajero p1 = new Pasajero("Stiven", 5678);

        Viaje vi1 = new Viaje(p1, c1, "Puerto Espejo", "Shango", "Iniciando");
        vi1.iniciar();

        System.out.println(c1);
        System.out.println(vi1);
    }
}