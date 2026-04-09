package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Conductor {
    private String nombre;
    private int id;
    private Vehiculo vehiculo;

    public Conductor(String nombre, int id){
        this.nombre = nombre;
        this.id = id;
    }

    public void asignarVehiculo(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }
}
